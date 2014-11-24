/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlChartItem.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlChartItem {

  // Typed constants
  public final static XlChartItem xlDataLabel = new XlChartItem(0);
  public final static XlChartItem xlChartArea = new XlChartItem(2);
  public final static XlChartItem xlSeries = new XlChartItem(3);
  public final static XlChartItem xlChartTitle = new XlChartItem(4);
  public final static XlChartItem xlWalls = new XlChartItem(5);
  public final static XlChartItem xlCorners = new XlChartItem(6);
  public final static XlChartItem xlDataTable = new XlChartItem(7);
  public final static XlChartItem xlTrendline = new XlChartItem(8);
  public final static XlChartItem xlErrorBars = new XlChartItem(9);
  public final static XlChartItem xlXErrorBars = new XlChartItem(10);
  public final static XlChartItem xlYErrorBars = new XlChartItem(11);
  public final static XlChartItem xlLegendEntry = new XlChartItem(12);
  public final static XlChartItem xlLegendKey = new XlChartItem(13);
  public final static XlChartItem xlShape = new XlChartItem(14);
  public final static XlChartItem xlMajorGridlines = new XlChartItem(15);
  public final static XlChartItem xlMinorGridlines = new XlChartItem(16);
  public final static XlChartItem xlAxisTitle = new XlChartItem(17);
  public final static XlChartItem xlUpBars = new XlChartItem(18);
  public final static XlChartItem xlPlotArea = new XlChartItem(19);
  public final static XlChartItem xlDownBars = new XlChartItem(20);
  public final static XlChartItem xlAxis = new XlChartItem(21);
  public final static XlChartItem xlSeriesLines = new XlChartItem(22);
  public final static XlChartItem xlFloor = new XlChartItem(23);
  public final static XlChartItem xlLegend = new XlChartItem(24);
  public final static XlChartItem xlHiLoLines = new XlChartItem(25);
  public final static XlChartItem xlDropLines = new XlChartItem(26);
  public final static XlChartItem xlRadarAxisLabels = new XlChartItem(27);
  public final static XlChartItem xlNothing = new XlChartItem(28);
  public final static XlChartItem xlLeaderLines = new XlChartItem(29);
  public final static XlChartItem xlDisplayUnitLabel = new XlChartItem(30);
  public final static XlChartItem xlPivotChartFieldButton = new XlChartItem(31);
  public final static XlChartItem xlPivotChartDropZone = new XlChartItem(32);

  // Integer constants for bitsets and switch statements
  public final static int _xlDataLabel = 0;
  public final static int _xlChartArea = 2;
  public final static int _xlSeries = 3;
  public final static int _xlChartTitle = 4;
  public final static int _xlWalls = 5;
  public final static int _xlCorners = 6;
  public final static int _xlDataTable = 7;
  public final static int _xlTrendline = 8;
  public final static int _xlErrorBars = 9;
  public final static int _xlXErrorBars = 10;
  public final static int _xlYErrorBars = 11;
  public final static int _xlLegendEntry = 12;
  public final static int _xlLegendKey = 13;
  public final static int _xlShape = 14;
  public final static int _xlMajorGridlines = 15;
  public final static int _xlMinorGridlines = 16;
  public final static int _xlAxisTitle = 17;
  public final static int _xlUpBars = 18;
  public final static int _xlPlotArea = 19;
  public final static int _xlDownBars = 20;
  public final static int _xlAxis = 21;
  public final static int _xlSeriesLines = 22;
  public final static int _xlFloor = 23;
  public final static int _xlLegend = 24;
  public final static int _xlHiLoLines = 25;
  public final static int _xlDropLines = 26;
  public final static int _xlRadarAxisLabels = 27;
  public final static int _xlNothing = 28;
  public final static int _xlLeaderLines = 29;
  public final static int _xlDisplayUnitLabel = 30;
  public final static int _xlPivotChartFieldButton = 31;
  public final static int _xlPivotChartDropZone = 32;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlChartItem(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlChartItem valueOf(int value) {
    switch(value) {
    case 0: return xlDataLabel;
    case 2: return xlChartArea;
    case 3: return xlSeries;
    case 4: return xlChartTitle;
    case 5: return xlWalls;
    case 6: return xlCorners;
    case 7: return xlDataTable;
    case 8: return xlTrendline;
    case 9: return xlErrorBars;
    case 10: return xlXErrorBars;
    case 11: return xlYErrorBars;
    case 12: return xlLegendEntry;
    case 13: return xlLegendKey;
    case 14: return xlShape;
    case 15: return xlMajorGridlines;
    case 16: return xlMinorGridlines;
    case 17: return xlAxisTitle;
    case 18: return xlUpBars;
    case 19: return xlPlotArea;
    case 20: return xlDownBars;
    case 21: return xlAxis;
    case 22: return xlSeriesLines;
    case 23: return xlFloor;
    case 24: return xlLegend;
    case 25: return xlHiLoLines;
    case 26: return xlDropLines;
    case 27: return xlRadarAxisLabels;
    case 28: return xlNothing;
    case 29: return xlLeaderLines;
    case 30: return xlDisplayUnitLabel;
    case 31: return xlPivotChartFieldButton;
    case 32: return xlPivotChartDropZone;
    default: return new XlChartItem(value);
    }
  }
}
