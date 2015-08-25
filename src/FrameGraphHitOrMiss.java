import java.awt.Color;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.*;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class FrameGraphHitOrMiss {
    
    float risultati[][] = new float[18][2];
    
    public FrameGraphHitOrMiss(float risultati[][]){
        this.risultati = risultati;
        showFrameChart();
    }
    
    public void showFrameChart(){
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.addValue(risultati[0][0], "risultati" , "10");
        data.addValue(risultati[1][0], "risultati" , "100");
        data.addValue(risultati[2][0], "risultati" , "1000");
        data.addValue(risultati[3][0], "risultati" , "10000");
        data.addValue(risultati[4][0], "risultati" , "100000");
        
                
        JFreeChart graph = ChartFactory.createLineChart (
        "Grafico Theta Hit or Miss",
        "Iterazioni",
        "Theta",
        data,
        PlotOrientation.VERTICAL,
        false,
        false,
        true);
        
        //XYPlot plot = (XYPlot) graph.getPlot ();
        
        //BarRenderer renderer = null;
        CategoryPlot plot = graph.getCategoryPlot();
        //renderer = new BarRenderer();
        ChartFrame frame = new ChartFrame("Frame", graph);
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setLocation(300, 10);
    }
    
}
