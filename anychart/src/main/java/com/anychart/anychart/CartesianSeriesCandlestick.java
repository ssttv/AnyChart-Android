package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Candlestick Series Class.<br/>
<b>Note:</b> Use {@link anychart.charts.Cartesian#candlestick} method to get this series.<br/>
{docs:Basic_Charts/Japanese_Candlestick_Chart}Learn more about Candlestick series{docs}
 */
public class CartesianSeriesCandlestick extends CartesianSeriesOHLC {

    public CartesianSeriesCandlestick() {
        js.setLength(0);
        js.append("var cartesianSeriesCandlestick").append(++variableIndex).append(" = anychart.core.cartesian.series.candlestick();");
        jsBase = "cartesianSeriesCandlestick" + variableIndex;
    }

    protected CartesianSeriesCandlestick(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CartesianSeriesCandlestick(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill fallingFill;
    private List<CartesianSeriesBase> setFallingFill = new ArrayList<>();

    /**
     * Setter for falling fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase setFallingFill(Fill fallingFill) {
        if (jsBase == null) {
            this.fallingFill = fallingFill;
        } else {
            this.fallingFill = fallingFill;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFallingFill" + ++variableIndex + " = " + jsBase + ".fallingFill(%s);", ((fallingFill != null) ? fallingFill.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s);", ((fallingFill != null) ? fallingFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill" + variableIndex);
        setFallingFill.add(item);
        return item;
    }
    private String generateJSsetFallingFill() {
        if (!setFallingFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Number opacity;
    private List<CartesianSeriesBase> setFallingFill1 = new ArrayList<>();

    /**
     * Falling fill color with opacity.
     */
    public CartesianSeriesBase fallingFill(String color, Number opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFallingFill1" + ++variableIndex + " = " + jsBase + ".fallingFill(%s, %s);", wrapQuotes(color), opacity));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s);", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill1" + variableIndex);
        setFallingFill1.add(item);
        return item;
    }
    private String generateJSsetFallingFill1() {
        if (!setFallingFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Number angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Number opacity1;
    private List<CartesianSeriesBase> setFallingFill2 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(GradientKey[] keys, Number angle, Number opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFallingFill2" + ++variableIndex + " = " + jsBase + ".fallingFill(%s, %s, %s, %b);", arrayToString(keys), angle, opacity1, mode));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %s, %b);", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill2" + variableIndex);
        setFallingFill2.add(item);
        return item;
    }
    private String generateJSsetFallingFill2() {
        if (!setFallingFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingFill3 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(GradientKey[] keys, Number angle, Number opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, "var setFallingFill3" + ++variableIndex + " = " + jsBase + ".fallingFill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill3" + variableIndex);
        setFallingFill3.add(item);
        return item;
    }
    private String generateJSsetFallingFill3() {
        if (!setFallingFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingFill4 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(GradientKey[] keys, Number angle, Number opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFallingFill4" + ++variableIndex + " = " + jsBase + ".fallingFill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill4" + variableIndex);
        setFallingFill4.add(item);
        return item;
    }
    private String generateJSsetFallingFill4() {
        if (!setFallingFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingFill5 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(String[] keys1, Number angle, Number opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFallingFill5" + ++variableIndex + " = " + jsBase + ".fallingFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill5" + variableIndex);
        setFallingFill5.add(item);
        return item;
    }
    private String generateJSsetFallingFill5() {
        if (!setFallingFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingFill6 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(String[] keys1, Number angle, Number opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, "var setFallingFill6" + ++variableIndex + " = " + jsBase + ".fallingFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill6" + variableIndex);
        setFallingFill6.add(item);
        return item;
    }
    private String generateJSsetFallingFill6() {
        if (!setFallingFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingFill7 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(String[] keys1, Number angle, Number opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFallingFill7" + ++variableIndex + " = " + jsBase + ".fallingFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill7" + variableIndex);
        setFallingFill7.add(item);
        return item;
    }
    private String generateJSsetFallingFill7() {
        if (!setFallingFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Number cx;
    private Number cy;
    private GraphicsMathRect mode3;
    private Number opacity2;
    private Number fx;
    private Number fy;
    private List<CartesianSeriesBase> setFallingFill8 = new ArrayList<>();

    /**
     * Radial gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(GradientKey[] keys2, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, "var setFallingFill8" + ++variableIndex + " = " + jsBase + ".fallingFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill8" + variableIndex);
        setFallingFill8.add(item);
        return item;
    }
    private String generateJSsetFallingFill8() {
        if (!setFallingFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingFill9 = new ArrayList<>();

    /**
     * Radial gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(String[] keys3, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, "var setFallingFill9" + ++variableIndex + " = " + jsBase + ".fallingFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill9" + variableIndex);
        setFallingFill9.add(item);
        return item;
    }
    private String generateJSsetFallingFill9() {
        if (!setFallingFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private PatternFill getFallingHatchFill;

    /**
     * Getter for falling hatch fill settings.
     */
    public PatternFill getFallingHatchFill() {
        if (getFallingHatchFill == null)
            getFallingHatchFill = new PatternFill(jsBase + ".fallingHatchFill()");

        return getFallingHatchFill;
    }

    private PatternFill patternFillOrTypeOrState;
    private HatchFill patternFillOrTypeOrState1;
    private HatchFillType patternFillOrTypeOrState2;
    private String patternFillOrTypeOrState3;
    private Boolean patternFillOrTypeOrState4;
    private String color1;
    private Number thickness;
    private Number size;
    private List<CartesianSeriesBase> setFallingHatchFill = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(PatternFill patternFillOrTypeOrState, String color1, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(patternFillOrTypeOrState.generateJs());
            js.append(String.format(Locale.US, "var setFallingHatchFill" + ++variableIndex + " = " + jsBase + ".fallingHatchFill(%s, %s, %s, %s);", ((patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %s, %s);", ((patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingHatchFill" + variableIndex);
        setFallingHatchFill.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill() {
        if (!setFallingHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingHatchFill1 = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(HatchFill patternFillOrTypeOrState1, String color1, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(patternFillOrTypeOrState1.generateJs());
            js.append(String.format(Locale.US, "var setFallingHatchFill1" + ++variableIndex + " = " + jsBase + ".fallingHatchFill(%s, %s, %s, %s);", ((patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %s, %s);", ((patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingHatchFill1" + variableIndex);
        setFallingHatchFill1.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill1() {
        if (!setFallingHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingHatchFill2 = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(HatchFillType patternFillOrTypeOrState2, String color1, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFallingHatchFill2" + ++variableIndex + " = " + jsBase + ".fallingHatchFill(%s, %s, %s, %s);", ((patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null"), wrapQuotes(color1), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %s, %s);", ((patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingHatchFill2" + variableIndex);
        setFallingHatchFill2.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill2() {
        if (!setFallingHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingHatchFill3 = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(String patternFillOrTypeOrState3, String color1, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFallingHatchFill3" + ++variableIndex + " = " + jsBase + ".fallingHatchFill(%s, %s, %s, %s);", wrapQuotes(patternFillOrTypeOrState3), wrapQuotes(color1), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %s, %s);", wrapQuotes(patternFillOrTypeOrState3), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingHatchFill3" + variableIndex);
        setFallingHatchFill3.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill3() {
        if (!setFallingHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingHatchFill4 = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(Boolean patternFillOrTypeOrState4, String color1, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFallingHatchFill4" + ++variableIndex + " = " + jsBase + ".fallingHatchFill(%b, %s, %s, %s);", patternFillOrTypeOrState4, wrapQuotes(color1), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%b, %s, %s, %s);", patternFillOrTypeOrState4, wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingHatchFill4" + variableIndex);
        setFallingHatchFill4.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill4() {
        if (!setFallingHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill risingFill;
    private List<CartesianSeriesBase> setRisingFill = new ArrayList<>();

    /**
     * Setter for rising fill settings using an array or a string.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setRisingFill(Fill risingFill) {
        if (jsBase == null) {
            this.risingFill = risingFill;
        } else {
            this.risingFill = risingFill;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRisingFill" + ++variableIndex + " = " + jsBase + ".risingFill(%s);", ((risingFill != null) ? risingFill.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s);", ((risingFill != null) ? risingFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingFill" + variableIndex);
        setRisingFill.add(item);
        return item;
    }
    private String generateJSsetRisingFill() {
        if (!setRisingFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color2;
    private Number opacity3;
    private List<CartesianSeriesBase> setRisingFill1 = new ArrayList<>();

    /**
     * Rising fill color with opacity.
     */
    public CartesianSeriesBase risingFill(String color2, Number opacity3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
        } else {
            this.color2 = color2;
            this.opacity3 = opacity3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRisingFill1" + ++variableIndex + " = " + jsBase + ".risingFill(%s, %s);", wrapQuotes(color2), opacity3));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s);", wrapQuotes(color2), opacity3));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingFill1" + variableIndex);
        setRisingFill1.add(item);
        return item;
    }
    private String generateJSsetRisingFill1() {
        if (!setRisingFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Number angle1;
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Number opacity4;
    private List<CartesianSeriesBase> setRisingFill2 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase risingFill(GradientKey[] keys4, Number angle1, Number opacity4, Boolean mode4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
        } else {
            this.keys4 = keys4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode4 = mode4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRisingFill2" + ++variableIndex + " = " + jsBase + ".risingFill(%s, %s, %s, %b);", arrayToString(keys4), angle1, opacity4, mode4));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %s, %b);", arrayToString(keys4), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingFill2" + variableIndex);
        setRisingFill2.add(item);
        return item;
    }
    private String generateJSsetRisingFill2() {
        if (!setRisingFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setRisingFill3 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase risingFill(GradientKey[] keys4, Number angle1, Number opacity4, VectorRect mode5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
        } else {
            this.keys4 = keys4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode5 = mode5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode5.generateJs());
            js.append(String.format(Locale.US, "var setRisingFill3" + ++variableIndex + " = " + jsBase + ".risingFill(%s, %s, %s, %s);", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %s, %s);", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingFill3" + variableIndex);
        setRisingFill3.add(item);
        return item;
    }
    private String generateJSsetRisingFill3() {
        if (!setRisingFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setRisingFill4 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase risingFill(GradientKey[] keys4, Number angle1, Number opacity4, String mode6) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
        } else {
            this.keys4 = keys4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode6 = mode6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRisingFill4" + ++variableIndex + " = " + jsBase + ".risingFill(%s, %s, %s, %s);", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %s, %s);", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingFill4" + variableIndex);
        setRisingFill4.add(item);
        return item;
    }
    private String generateJSsetRisingFill4() {
        if (!setRisingFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setRisingFill5 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase risingFill(String[] keys5, Number angle1, Number opacity4, Boolean mode4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
        } else {
            this.keys5 = keys5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode4 = mode4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRisingFill5" + ++variableIndex + " = " + jsBase + ".risingFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingFill5" + variableIndex);
        setRisingFill5.add(item);
        return item;
    }
    private String generateJSsetRisingFill5() {
        if (!setRisingFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setRisingFill6 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase risingFill(String[] keys5, Number angle1, Number opacity4, VectorRect mode5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
        } else {
            this.keys5 = keys5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode5 = mode5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode5.generateJs());
            js.append(String.format(Locale.US, "var setRisingFill6" + ++variableIndex + " = " + jsBase + ".risingFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingFill6" + variableIndex);
        setRisingFill6.add(item);
        return item;
    }
    private String generateJSsetRisingFill6() {
        if (!setRisingFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setRisingFill7 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase risingFill(String[] keys5, Number angle1, Number opacity4, String mode6) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
        } else {
            this.keys5 = keys5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode6 = mode6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRisingFill7" + ++variableIndex + " = " + jsBase + ".risingFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingFill7" + variableIndex);
        setRisingFill7.add(item);
        return item;
    }
    private String generateJSsetRisingFill7() {
        if (!setRisingFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Number cx1;
    private Number cy1;
    private GraphicsMathRect mode7;
    private Number opacity5;
    private Number fx1;
    private Number fy1;
    private List<CartesianSeriesBase> setRisingFill8 = new ArrayList<>();

    /**
     * Radial gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase risingFill(GradientKey[] keys6, Number cx1, Number cy1, GraphicsMathRect mode7, Number opacity5, Number fx1, Number fy1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            
            this.keys6 = keys6;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            
            this.mode7 = mode7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.keys6 = keys6;
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.mode7 = mode7;
            this.opacity5 = opacity5;
            this.fx1 = fx1;
            this.fy1 = fy1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode7.generateJs());
            js.append(String.format(Locale.US, "var setRisingFill8" + ++variableIndex + " = " + jsBase + ".risingFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingFill8" + variableIndex);
        setRisingFill8.add(item);
        return item;
    }
    private String generateJSsetRisingFill8() {
        if (!setRisingFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setRisingFill9 = new ArrayList<>();

    /**
     * Radial gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase risingFill(String[] keys7, Number cx1, Number cy1, GraphicsMathRect mode7, Number opacity5, Number fx1, Number fy1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            
            this.keys7 = keys7;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            
            this.mode7 = mode7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.keys7 = keys7;
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.mode7 = mode7;
            this.opacity5 = opacity5;
            this.fx1 = fx1;
            this.fy1 = fy1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode7.generateJs());
            js.append(String.format(Locale.US, "var setRisingFill9" + ++variableIndex + " = " + jsBase + ".risingFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingFill9" + variableIndex);
        setRisingFill9.add(item);
        return item;
    }
    private String generateJSsetRisingFill9() {
        if (!setRisingFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings1;
    private PatternFill getRisingHatchFill;

    /**
     * Getter for rising hatch fill settings.
     */
    public PatternFill getRisingHatchFill() {
        if (getRisingHatchFill == null)
            getRisingHatchFill = new PatternFill(jsBase + ".risingHatchFill()");

        return getRisingHatchFill;
    }

    private PatternFill patternFillOrTypeOrState5;
    private HatchFill patternFillOrTypeOrState6;
    private HatchFillType patternFillOrTypeOrState7;
    private String patternFillOrTypeOrState8;
    private Boolean patternFillOrTypeOrState9;
    private String color3;
    private Number thickness1;
    private Number size1;
    private List<CartesianSeriesBase> setRisingHatchFill = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setRisingHatchFill(PatternFill patternFillOrTypeOrState5, String color3, Number thickness1, Number size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState5 = patternFillOrTypeOrState5;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState5 = patternFillOrTypeOrState5;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(patternFillOrTypeOrState5.generateJs());
            js.append(String.format(Locale.US, "var setRisingHatchFill" + ++variableIndex + " = " + jsBase + ".risingHatchFill(%s, %s, %s, %s);", ((patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.getJsBase() : "null"), wrapQuotes(color3), thickness1, size1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %s, %s);", ((patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.getJsBase() : "null"), wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingHatchFill" + variableIndex);
        setRisingHatchFill.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill() {
        if (!setRisingHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setRisingHatchFill1 = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setRisingHatchFill(HatchFill patternFillOrTypeOrState6, String color3, Number thickness1, Number size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState6 = patternFillOrTypeOrState6;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState6 = patternFillOrTypeOrState6;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(patternFillOrTypeOrState6.generateJs());
            js.append(String.format(Locale.US, "var setRisingHatchFill1" + ++variableIndex + " = " + jsBase + ".risingHatchFill(%s, %s, %s, %s);", ((patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.getJsBase() : "null"), wrapQuotes(color3), thickness1, size1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %s, %s);", ((patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.getJsBase() : "null"), wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingHatchFill1" + variableIndex);
        setRisingHatchFill1.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill1() {
        if (!setRisingHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setRisingHatchFill2 = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setRisingHatchFill(HatchFillType patternFillOrTypeOrState7, String color3, Number thickness1, Number size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState7 = patternFillOrTypeOrState7;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState7 = patternFillOrTypeOrState7;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRisingHatchFill2" + ++variableIndex + " = " + jsBase + ".risingHatchFill(%s, %s, %s, %s);", ((patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null"), wrapQuotes(color3), thickness1, size1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %s, %s);", ((patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null"), wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingHatchFill2" + variableIndex);
        setRisingHatchFill2.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill2() {
        if (!setRisingHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setRisingHatchFill3 = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setRisingHatchFill(String patternFillOrTypeOrState8, String color3, Number thickness1, Number size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState8 = patternFillOrTypeOrState8;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState8 = patternFillOrTypeOrState8;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRisingHatchFill3" + ++variableIndex + " = " + jsBase + ".risingHatchFill(%s, %s, %s, %s);", wrapQuotes(patternFillOrTypeOrState8), wrapQuotes(color3), thickness1, size1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %s, %s);", wrapQuotes(patternFillOrTypeOrState8), wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingHatchFill3" + variableIndex);
        setRisingHatchFill3.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill3() {
        if (!setRisingHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setRisingHatchFill4 = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setRisingHatchFill(Boolean patternFillOrTypeOrState9, String color3, Number thickness1, Number size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState9 = patternFillOrTypeOrState9;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState9 = patternFillOrTypeOrState9;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRisingHatchFill4" + ++variableIndex + " = " + jsBase + ".risingHatchFill(%b, %s, %s, %s);", patternFillOrTypeOrState9, wrapQuotes(color3), thickness1, size1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%b, %s, %s, %s);", patternFillOrTypeOrState9, wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setRisingHatchFill4" + variableIndex);
        setRisingHatchFill4.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill4() {
        if (!setRisingHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setRisingHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetFallingHatchFill() {
        if (getFallingHatchFill != null) {
            return getFallingHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetRisingHatchFill() {
        if (getRisingHatchFill != null) {
            return getRisingHatchFill.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetFallingHatchFill());
        jsGetters.append(generateJSgetRisingHatchFill());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetFallingFill());
        js.append(generateJSsetFallingFill1());
        js.append(generateJSsetFallingFill2());
        js.append(generateJSsetFallingFill3());
        js.append(generateJSsetFallingFill4());
        js.append(generateJSsetFallingFill5());
        js.append(generateJSsetFallingFill6());
        js.append(generateJSsetFallingFill7());
        js.append(generateJSsetFallingFill8());
        js.append(generateJSsetFallingFill9());
        js.append(generateJSsetFallingHatchFill());
        js.append(generateJSsetFallingHatchFill1());
        js.append(generateJSsetFallingHatchFill2());
        js.append(generateJSsetFallingHatchFill3());
        js.append(generateJSsetFallingHatchFill4());
        js.append(generateJSsetRisingFill());
        js.append(generateJSsetRisingFill1());
        js.append(generateJSsetRisingFill2());
        js.append(generateJSsetRisingFill3());
        js.append(generateJSsetRisingFill4());
        js.append(generateJSsetRisingFill5());
        js.append(generateJSsetRisingFill6());
        js.append(generateJSsetRisingFill7());
        js.append(generateJSsetRisingFill8());
        js.append(generateJSsetRisingFill9());
        js.append(generateJSsetRisingHatchFill());
        js.append(generateJSsetRisingHatchFill1());
        js.append(generateJSsetRisingHatchFill2());
        js.append(generateJSsetRisingHatchFill3());
        js.append(generateJSsetRisingHatchFill4());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}