package uthm.javabook.datavisualization;

/*
 * Author : Aamir Khan
 * Faculty of Computer Science and Information Technology
 * University Tun Hussein Onn Malaysia
 */

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class ScatterGraphClass extends JFrame {
	  private static final long serialVersionUID = 6294689542092367723L;

	  public ScatterGraphClass(String title) {
	    super(title);

	    // Create dataset
	    XYDataset dataset = createDataset();

	    // Create chart
	    JFreeChart chart = ChartFactory.createScatterPlot(
	        "Boys VS Girls weight comparison chart", 
	        "X-Axis", "Y-Axis", dataset);

	    
	    //Changes background color
	    XYPlot plot = (XYPlot)chart.getPlot();
	    plot.setBackgroundPaint(new Color(255,255,255));
	    //plot.getRenderer().setSeriesStroke(0,);
	    
	   
	    // Create Panel
	    ChartPanel panel = new ChartPanel(chart);
	    setContentPane(panel);
	  }

	  private XYDataset createDataset() {
	    XYSeriesCollection dataset = new XYSeriesCollection();

	    //Boys (Age,weight) series
	    XYSeries series1 = new XYSeries("Malaysia");
	    series1.add(2011, 51.9);
	    series1.add(2012, 54.6);
	    series1.add(2013, 57.9);
	    series1.add(2014, 57);
	    series1.add(2015, 60.1);
	    series1.add(2016, 62.5);
	    series1.add(2017, 64.9);
	    series1.add(2018, 65.3);
	    series1.add(2019, 67.8);
	    series1.add(2020, 80.4);

	    dataset.addSeries(series1);
	    
	   //Girls (Age,weight) series
	    XYSeries series2 = new XYSeries("Indonesia");
	    series2.add(2011, 70.5);
	    series2.add(2012, 80.1);
	    series2.add(2013, 87.2);
	    series2.add(2014, 94.5);
	    series2.add(2015, 101.4);
	    series2.add(2016, 107.4);
	    series2.add(2017, 112.8);
	    series2.add(2018, 118.2);
	    series2.add(2019, 122.9);
	    series2.add(2020, 123.4);
	    dataset.addSeries(series2);

	    //Boys (Age,weight) series
	    XYSeries series3 = new XYSeries("Thailand");
	    series3.add(2011, 72.9);
	    series3.add(2012, 81.6);
	    series3.add(2013, 88.9);
	    series3.add(2014, 96);
	    series3.add(2015, 102.1);
	    series3.add(2016, 108.5);
	    series3.add(2017, 113.9);
	    series3.add(2018, 119.3);
	    series3.add(2019, 123.8);
	    series3.add(2020, 124.4);
	    dataset.addSeries(series3);
	    
	    //Boys (Age,weight) series
	    XYSeries series4 = new XYSeries("Singapore");
	    series4.add(2011, 5.9);
	    series4.add(2012, 7.6);
	    series4.add(2013, 8.9);
	    series4.add(2014, 9);
	    series4.add(2015, 11.1);
	    series4.add(2016, 11.5);
	    series4.add(2017, 12.9);
	    series4.add(2018, 12.3);
	    series4.add(2019, 13.8);
	    series4.add(2020, 15.4);
	    dataset.addSeries(series4);
	    
	    return dataset;
	  }

	  public static void main(String[] args) {
	    SwingUtilities.invokeLater(() -> {
	    	ScatterGraphClass example = new ScatterGraphClass("Scatter Chart Example");
	      example.setSize(800, 400);
	      example.setLocationRelativeTo(null);
	      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	      example.setVisible(true);
	    });
	  }
	}