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

public class FrameChart {
    
    float risultati[][] = new float[18][2];
    float risultati1[][] = new float[18][2];
    float risultati2[][] = new float[18][2];
    
    public FrameChart(float risultati[][], float risultati1[][], float risultati2[][]){
        this.risultati = risultati;
        this.risultati1 = risultati1;
        this.risultati2 = risultati2;
        showFrameChart();
    }
    
    public void showFrameChart(){
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        //risultati HitOrMiss
        data.addValue(risultati[0][0], "Hit or Miss" , "10");
        data.addValue(risultati[1][0], "Hit or Miss" , "100");
        data.addValue(risultati[2][0], "Hit or Miss" , "1000");
        data.addValue(risultati[3][0], "Hit or Miss" , "10000");
        data.addValue(risultati[4][0], "Hit or Miss" , "100000");
        data.addValue(risultati[5][0], "Hit or Miss" , "1000000");
        //risultatiSampleMean
        data.addValue(risultati1[0][0], "Sample Mean" , "10");
        data.addValue(risultati1[1][0], "Sample Mean" , "100");
        data.addValue(risultati1[2][0], "Sample Mean" , "1000");
        data.addValue(risultati1[3][0], "Sample Mean" , "10000");
        data.addValue(risultati1[4][0], "Sample Mean" , "100000");
        data.addValue(risultati1[5][0], "Sample Mean" , "1000000");
        //risultatiAntitheticVariates
        data.addValue(risultati2[0][0], "Variabile Antitetica" , "10");
        data.addValue(risultati2[1][0], "Variabile Antitetica" , "100");
        data.addValue(risultati2[2][0], "Variabile Antitetica" , "1000");
        data.addValue(risultati2[3][0], "Variabile Antitetica" , "10000");
        data.addValue(risultati2[4][0], "Variabile Antitetica" , "100000");
        data.addValue(risultati2[5][0], "Variabile Antitetica" , "1000000");
        
                
        JFreeChart graph = ChartFactory.createLineChart (
        "Grafico",
        "Iterazioni",
        "Theta",
        data,
        PlotOrientation.VERTICAL,
        true,
        false,
        false);
        
        //XYPlot plot = (XYPlot) graph.getPlot ();
        
        //BarRenderer renderer = null;
        CategoryPlot plot = graph.getCategoryPlot();
        //renderer = new BarRenderer();
        ChartFrame frame = new ChartFrame("Grafico", graph);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLocation(300, 10);
    }
    
}
