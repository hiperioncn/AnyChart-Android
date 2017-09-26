package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// chart class
public class ChartsMap extends Chart {

    public ChartsMap() {
        js.append("chart = anychart.map();");
    }

    
    private View var_args;
    private Set var_args1;
    private String[] var_args2;

    public void setAddseries(View var_args) {
        this.var_args = var_args;

        js.append(String.format(Locale.US, "chart.addSeries(%s);", (var_args != null) ? var_args.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.addSeries(%s);", (var_args != null) ? var_args.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setAddseries(Set var_args1) {
        this.var_args1 = var_args1;

        js.append(String.format(Locale.US, "chart.addSeries(%s);", (var_args1 != null) ? var_args1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.addSeries(%s);", (var_args1 != null) ? var_args1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setAddseries(String[] var_args2) {
        this.var_args2 = var_args2;

        js.append(String.format(Locale.US, "chart.addSeries(%s);", Arrays.toString(var_args2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.addSeries(%s);", Arrays.toString(var_args2)));
            js.setLength(0);
        }
    }

    private Animation getanimation;

    public Animation getAnimation() {
        if (getanimation == null)
            getanimation = new Animation("chart.animation()");

        return getanimation;
    }

    private Boolean animation;
    private String animation1;

    public void setAnimation(Boolean animation) {
        this.animation = animation;

        js.append(String.format(Locale.US, "chart.animation(%b);", animation));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.animation(%b);", animation));
            js.setLength(0);
        }
    }


    public void setAnimation(String animation1) {
        this.animation1 = animation1;

        js.append(String.format(Locale.US, "chart.animation(%s);", animation1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.animation(%s);", animation1));
            js.setLength(0);
        }
    }

    private Boolean enabled;
    private Double duration;

    public void setAnimation(Boolean enabled, Double duration) {
        this.enabled = enabled;
        this.duration = duration;

        js.append(String.format(Locale.US, "chart.animation(%b, %f);", enabled, duration));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.animation(%b, %f);", enabled, duration));
            js.setLength(0);
        }
    }

    private AxesMapSettings getaxes;

    public AxesMapSettings getAxes() {
        if (getaxes == null)
            getaxes = new AxesMapSettings("chart.axes()");

        return getaxes;
    }

    private String axes;
    private Boolean axes1;

    public void setAxes(String axes) {
        this.axes = axes;

        js.append(String.format(Locale.US, "chart.axes(%s);", axes));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.axes(%s);", axes));
            js.setLength(0);
        }
    }


    public void setAxes(Boolean axes1) {
        this.axes1 = axes1;

        js.append(String.format(Locale.US, "chart.axes(%b);", axes1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.axes(%b);", axes1));
            js.setLength(0);
        }
    }

    private UiBackground getbackground;

    public UiBackground getBackground() {
        if (getbackground == null)
            getbackground = new UiBackground("chart.background()");

        return getbackground;
    }

    private String background;

    public void setBackground(String background) {
        this.background = background;

        js.append(String.format(Locale.US, "chart.background(%s);", background));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.background(%s);", background));
            js.setLength(0);
        }
    }

    private Double bottom;
    private String bottom1;

    public void setBottom(Double bottom) {
        this.bottom = bottom;

        js.append(String.format(Locale.US, "chart.bottom(%f);", bottom));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bottom(%f);", bottom));
            js.setLength(0);
        }
    }


    public void setBottom(String bottom1) {
        this.bottom1 = bottom1;

        js.append(String.format(Locale.US, "chart.bottom(%s);", bottom1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bottom(%s);", bottom1));
            js.setLength(0);
        }
    }

    private Bounds getbounds;

    public Bounds getBounds() {
        if (getbounds == null)
            getbounds = new Bounds("chart.bounds()");

        return getbounds;
    }

    private RectObj bounds;
    private AnychartMathRect bounds1;
    private Bounds bounds2;

    public void setBounds(RectObj bounds) {
        this.bounds = bounds;

        js.append(String.format(Locale.US, "chart.bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBounds(AnychartMathRect bounds1) {
        this.bounds1 = bounds1;

        js.append(String.format(Locale.US, "chart.bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBounds(Bounds bounds2) {
        this.bounds2 = bounds2;

        js.append(String.format(Locale.US, "chart.bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double x;
    private String x1;
    private Double y;
    private String y1;
    private Double width;
    private String width1;
    private Double height;
    private String height1;

    public void setBounds(Double x, Double y, Double width, Double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %f, %f);", x, y, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %f, %f);", x, y, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, Double y, Double width, String height1) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %f, %s);", x, y, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %f, %s);", x, y, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, Double y, String width1, Double height) {
        this.x = x;
        this.y = y;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %s, %f);", x, y, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %s, %f);", x, y, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, Double y, String width1, String height1) {
        this.x = x;
        this.y = y;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %s, %s);", x, y, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %s, %s);", x, y, width1, height1));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, Double width, Double height) {
        this.x = x;
        this.y1 = y1;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %f, %f);", x, y1, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %f, %f);", x, y1, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, Double width, String height1) {
        this.x = x;
        this.y1 = y1;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %f, %s);", x, y1, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %f, %s);", x, y1, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, String width1, Double height) {
        this.x = x;
        this.y1 = y1;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %s, %f);", x, y1, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %s, %f);", x, y1, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, String width1, String height1) {
        this.x = x;
        this.y1 = y1;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %s, %s);", x, y1, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %s, %s);", x, y1, width1, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, Double width, Double height) {
        this.x1 = x1;
        this.y = y;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %f, %f);", x1, y, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %f, %f);", x1, y, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, Double width, String height1) {
        this.x1 = x1;
        this.y = y;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %f, %s);", x1, y, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %f, %s);", x1, y, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, String width1, Double height) {
        this.x1 = x1;
        this.y = y;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %s, %f);", x1, y, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %s, %f);", x1, y, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, String width1, String height1) {
        this.x1 = x1;
        this.y = y;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %s, %s);", x1, y, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %s, %s);", x1, y, width1, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, Double width, Double height) {
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %f, %f);", x1, y1, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %f, %f);", x1, y1, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, Double width, String height1) {
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %f, %s);", x1, y1, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %f, %s);", x1, y1, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, String width1, Double height) {
        this.x1 = x1;
        this.y1 = y1;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %s, %f);", x1, y1, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %s, %f);", x1, y1, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, String width1, String height1) {
        this.x1 = x1;
        this.y1 = y1;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %s, %s);", x1, y1, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %s, %s);", x1, y1, width1, height1));
            js.setLength(0);
        }
    }

    private View data;
    private Set data1;
    private String[] data2;
    private String data3;
    private TextParsingMode csvSettings;
    private TextParsingSettings csvSettings1;

    public void setBubble(View data, TextParsingMode csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(View data, TextParsingSettings csvSettings1) {
        this.data = data;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(Set data1, TextParsingMode csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(Set data1, TextParsingSettings csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(String[] data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(String[] data2, TextParsingSettings csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(String data3, TextParsingMode csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(String data3, TextParsingSettings csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double index;

    public void setCallout(Double index) {
        this.index = index;

        js.append(String.format(Locale.US, "chart.callout(%f);", index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.callout(%f);", index));
            js.setLength(0);
        }
    }

    private String callout;
    private Boolean callout1;

    public void setCallout(String callout) {
        this.callout = callout;

        js.append(String.format(Locale.US, "chart.callout(%s);", callout));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.callout(%s);", callout));
            js.setLength(0);
        }
    }


    public void setCallout(Boolean callout1) {
        this.callout1 = callout1;

        js.append(String.format(Locale.US, "chart.callout(%b);", callout1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.callout(%b);", callout1));
            js.setLength(0);
        }
    }

    private Double index1;
    private String callout2;
    private Boolean callout3;

    public void setCallout(String callout2, Double index1) {
        this.callout2 = callout2;
        this.index1 = index1;

        js.append(String.format(Locale.US, "chart.callout(%s, %f);", callout2, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.callout(%s, %f);", callout2, index1));
            js.setLength(0);
        }
    }


    public void setCallout(Boolean callout3, Double index1) {
        this.callout3 = callout3;
        this.index1 = index1;

        js.append(String.format(Locale.US, "chart.callout(%b, %f);", callout3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.callout(%b, %f);", callout3, index1));
            js.setLength(0);
        }
    }

    private View data4;
    private Set data5;
    private String[] data6;
    private String data7;
    private TextParsingMode csvSettings2;
    private TextParsingSettings csvSettings3;

    public void setChoropleth(View data4, TextParsingMode csvSettings2) {
        this.data4 = data4;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.choropleth(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.choropleth(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setChoropleth(View data4, TextParsingSettings csvSettings3) {
        this.data4 = data4;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.choropleth(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.choropleth(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setChoropleth(Set data5, TextParsingMode csvSettings2) {
        this.data5 = data5;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.choropleth(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.choropleth(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setChoropleth(Set data5, TextParsingSettings csvSettings3) {
        this.data5 = data5;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.choropleth(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.choropleth(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setChoropleth(String[] data6, TextParsingMode csvSettings2) {
        this.data6 = data6;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.choropleth(%s, %s);", Arrays.toString(data6), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.choropleth(%s, %s);", Arrays.toString(data6), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setChoropleth(String[] data6, TextParsingSettings csvSettings3) {
        this.data6 = data6;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.choropleth(%s, %s);", Arrays.toString(data6), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.choropleth(%s, %s);", Arrays.toString(data6), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setChoropleth(String data7, TextParsingMode csvSettings2) {
        this.data7 = data7;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.choropleth(%s, %s);", data7, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.choropleth(%s, %s);", data7, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setChoropleth(String data7, TextParsingSettings csvSettings3) {
        this.data7 = data7;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.choropleth(%s, %s);", data7, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.choropleth(%s, %s);", data7, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private UiColorRange getcolorRange;

    public UiColorRange getColorrange() {
        if (getcolorRange == null)
            getcolorRange = new UiColorRange("chart.colorRange()");

        return getcolorRange;
    }

    private String colorRange;

    public void setColorrange(String colorRange) {
        this.colorRange = colorRange;

        js.append(String.format(Locale.US, "chart.colorRange(%s);", colorRange));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.colorRange(%s);", colorRange));
            js.setLength(0);
        }
    }

    private View data8;
    private Set data9;
    private String[] data10;
    private String data11;
    private TextParsingMode csvSettings4;
    private TextParsingSettings csvSettings5;

    public void setConnector(View data8, TextParsingMode csvSettings4) {
        this.data8 = data8;
        this.csvSettings4 = csvSettings4;

        js.append(String.format(Locale.US, "chart.connector(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connector(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setConnector(View data8, TextParsingSettings csvSettings5) {
        this.data8 = data8;
        this.csvSettings5 = csvSettings5;

        js.append(String.format(Locale.US, "chart.connector(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connector(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setConnector(Set data9, TextParsingMode csvSettings4) {
        this.data9 = data9;
        this.csvSettings4 = csvSettings4;

        js.append(String.format(Locale.US, "chart.connector(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connector(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setConnector(Set data9, TextParsingSettings csvSettings5) {
        this.data9 = data9;
        this.csvSettings5 = csvSettings5;

        js.append(String.format(Locale.US, "chart.connector(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connector(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setConnector(String[] data10, TextParsingMode csvSettings4) {
        this.data10 = data10;
        this.csvSettings4 = csvSettings4;

        js.append(String.format(Locale.US, "chart.connector(%s, %s);", Arrays.toString(data10), (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connector(%s, %s);", Arrays.toString(data10), (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setConnector(String[] data10, TextParsingSettings csvSettings5) {
        this.data10 = data10;
        this.csvSettings5 = csvSettings5;

        js.append(String.format(Locale.US, "chart.connector(%s, %s);", Arrays.toString(data10), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connector(%s, %s);", Arrays.toString(data10), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setConnector(String data11, TextParsingMode csvSettings4) {
        this.data11 = data11;
        this.csvSettings4 = csvSettings4;

        js.append(String.format(Locale.US, "chart.connector(%s, %s);", data11, (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connector(%s, %s);", data11, (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setConnector(String data11, TextParsingSettings csvSettings5) {
        this.data11 = data11;
        this.csvSettings5 = csvSettings5;

        js.append(String.format(Locale.US, "chart.connector(%s, %s);", data11, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connector(%s, %s);", data11, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Layer getcontainer;

    public Layer getContainer() {
        if (getcontainer == null)
            getcontainer = new Layer("chart.container()");

        return getcontainer;
    }

    private Layer container;
    private Stage container1;
    private String container2;
    private Element container3;

    public void setContainer(Layer container) {
        this.container = container;

        js.append(String.format(Locale.US, "chart.container(%s);", (container != null) ? container.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", (container != null) ? container.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setContainer(Stage container1) {
        this.container1 = container1;

        js.append(String.format(Locale.US, "chart.container(%s);", (container1 != null) ? container1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", (container1 != null) ? container1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setContainer(String container2) {
        this.container2 = container2;

        js.append(String.format(Locale.US, "chart.container(%s);", container2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", container2));
            js.setLength(0);
        }
    }


    public void setContainer(Element container3) {
        this.container3 = container3;

        js.append(String.format(Locale.US, "chart.container(%s);", (container3 != null) ? container3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", (container3 != null) ? container3.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private ContextMenu getcontextMenu;

    public ContextMenu getContextmenu() {
        if (getcontextMenu == null)
            getcontextMenu = new ContextMenu("chart.contextMenu()");

        return getcontextMenu;
    }

    private String contextMenu;
    private Boolean contextMenu1;

    public void setContextmenu(String contextMenu) {
        this.contextMenu = contextMenu;

        js.append(String.format(Locale.US, "chart.contextMenu(%s);", contextMenu));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.contextMenu(%s);", contextMenu));
            js.setLength(0);
        }
    }


    public void setContextmenu(Boolean contextMenu1) {
        this.contextMenu1 = contextMenu1;

        js.append(String.format(Locale.US, "chart.contextMenu(%b);", contextMenu1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.contextMenu(%b);", contextMenu1));
            js.setLength(0);
        }
    }

    private ChartCredits getcredits;

    public ChartCredits getCredits() {
        if (getcredits == null)
            getcredits = new ChartCredits("chart.credits()");

        return getcredits;
    }

    private String credits;
    private Boolean credits1;

    public void setCredits(String credits) {
        this.credits = credits;

        js.append(String.format(Locale.US, "chart.credits(%s);", credits));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.credits(%s);", credits));
            js.setLength(0);
        }
    }


    public void setCredits(Boolean credits1) {
        this.credits1 = credits1;

        js.append(String.format(Locale.US, "chart.credits(%b);", credits1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.credits(%b);", credits1));
            js.setLength(0);
        }
    }

    private Crosshair getcrosshair;

    public Crosshair getCrosshair() {
        if (getcrosshair == null)
            getcrosshair = new Crosshair("chart.crosshair()");

        return getcrosshair;
    }

    private String crosshair;
    private Boolean crosshair1;

    public void setCrosshair(String crosshair) {
        this.crosshair = crosshair;

        js.append(String.format(Locale.US, "chart.crosshair(%s);", crosshair));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.crosshair(%s);", crosshair));
            js.setLength(0);
        }
    }


    public void setCrosshair(Boolean crosshair1) {
        this.crosshair1 = crosshair1;

        js.append(String.format(Locale.US, "chart.crosshair(%b);", crosshair1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.crosshair(%b);", crosshair1));
            js.setLength(0);
        }
    }

    private String crs;
    private MapProjections crs1;
    private String crs2;

    public void setCrs(String crs) {
        this.crs = crs;

        js.append(String.format(Locale.US, "chart.crs(%s);", crs));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.crs(%s);", crs));
            js.setLength(0);
        }
    }


    public void setCrs(MapProjections crs1) {
        this.crs1 = crs1;

        js.append(String.format(Locale.US, "chart.crs(%s);", (crs1 != null) ? crs1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.crs(%s);", (crs1 != null) ? crs1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Animation getcrsAnimation;

    public Animation getCrsanimation() {
        if (getcrsAnimation == null)
            getcrsAnimation = new Animation("chart.crsAnimation()");

        return getcrsAnimation;
    }

    private Boolean crsAnimation;
    private String crsAnimation1;
    private Double duration1;

    public void setCrsanimation(Boolean crsAnimation, Double duration1) {
        this.crsAnimation = crsAnimation;
        this.duration1 = duration1;

        js.append(String.format(Locale.US, "chart.crsAnimation(%b, %f);", crsAnimation, duration1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.crsAnimation(%b, %f);", crsAnimation, duration1));
            js.setLength(0);
        }
    }


    public void setCrsanimation(String crsAnimation1, Double duration1) {
        this.crsAnimation1 = crsAnimation1;
        this.duration1 = duration1;

        js.append(String.format(Locale.US, "chart.crsAnimation(%s, %f);", crsAnimation1, duration1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.crsAnimation(%s, %f);", crsAnimation1, duration1));
            js.setLength(0);
        }
    }

    private String defaultSeriesType;
    private MapSeriesType defaultSeriesType1;

    public void setDefaultseriestype(String defaultSeriesType) {
        this.defaultSeriesType = defaultSeriesType;

        js.append(String.format(Locale.US, "chart.defaultSeriesType(%s);", defaultSeriesType));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.defaultSeriesType(%s);", defaultSeriesType));
            js.setLength(0);
        }
    }


    public void setDefaultseriestype(MapSeriesType defaultSeriesType1) {
        this.defaultSeriesType1 = defaultSeriesType1;

        js.append(String.format(Locale.US, "chart.defaultSeriesType(%s);", (defaultSeriesType1 != null) ? defaultSeriesType1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.defaultSeriesType(%s);", (defaultSeriesType1 != null) ? defaultSeriesType1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean async;

    public void setDraw(Boolean async) {
        this.async = async;

        js.append(String.format(Locale.US, "chart.draw(%b);", async));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.draw(%b);", async));
            js.setLength(0);
        }
    }

    private String drillDownMap;

    public void setDrilldownmap(String drillDownMap) {
        this.drillDownMap = drillDownMap;

        js.append(String.format(Locale.US, "chart.drillDownMap(%s);", drillDownMap));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.drillDownMap(%s);", drillDownMap));
            js.setLength(0);
        }
    }

    private String id;
    private ChartsMap map;

    public void setDrillto(String id, ChartsMap map) {
        this.id = id;
        this.map = map;

        js.append(String.format(Locale.US, "chart.drillTo(%s, %s);", id, (map != null) ? map.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.drillTo(%s, %s);", id, (map != null) ? map.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String id1;

    public void setFeaturecrs(String id1) {
        this.id1 = id1;

        js.append(String.format(Locale.US, "chart.featureCrs(%s);", id1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.featureCrs(%s);", id1));
            js.setLength(0);
        }
    }

    private String id2;
    private String crs3;

    public void setFeaturecrs(String id2, String crs3) {
        this.id2 = id2;
        this.crs3 = crs3;

        js.append(String.format(Locale.US, "chart.featureCrs(%s, %s);", id2, crs3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.featureCrs(%s, %s);", id2, crs3));
            js.setLength(0);
        }
    }

    private String id3;

    public void setFeaturescalefactor(String id3) {
        this.id3 = id3;

        js.append(String.format(Locale.US, "chart.featureScaleFactor(%s);", id3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.featureScaleFactor(%s);", id3));
            js.setLength(0);
        }
    }

    private String id4;
    private Double ratio;

    public void setFeaturescalefactor(String id4, Double ratio) {
        this.id4 = id4;
        this.ratio = ratio;

        js.append(String.format(Locale.US, "chart.featureScaleFactor(%s, %f);", id4, ratio));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.featureScaleFactor(%s, %f);", id4, ratio));
            js.setLength(0);
        }
    }

    private String id5;

    public void setFeaturetranslation(String id5) {
        this.id5 = id5;

        js.append(String.format(Locale.US, "chart.featureTranslation(%s);", id5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.featureTranslation(%s);", id5));
            js.setLength(0);
        }
    }

    private String id6;
    private Double dx;
    private Double dy;

    public void setFeaturetranslation(String id6, Double dx, Double dy) {
        this.id6 = id6;
        this.dx = dx;
        this.dy = dy;

        js.append(String.format(Locale.US, "chart.featureTranslation(%s, %f, %f);", id6, dx, dy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.featureTranslation(%s, %f, %f);", id6, dx, dy));
            js.setLength(0);
        }
    }

    private String data12;
    private String data13;

    public void setGeodata(String data12, String data13) {
        this.data12 = data12;
        this.data13 = data13;

        js.append(String.format(Locale.US, "chart.geoData(%s, %s);", data12, data13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.geoData(%s, %s);", data12, data13));
            js.setLength(0);
        }
    }

    private String geoIdField;

    public void setGeoidfield(String geoIdField) {
        this.geoIdField = geoIdField;

        js.append(String.format(Locale.US, "chart.geoIdField(%s);", geoIdField));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.geoIdField(%s);", geoIdField));
            js.setLength(0);
        }
    }

    private AnychartMathRect getgetPlotBounds;

    public AnychartMathRect getGetplotbounds() {
        if (getgetPlotBounds == null)
            getgetPlotBounds = new AnychartMathRect("chart.getPlotBounds()");

        return getgetPlotBounds;
    }

    private Double id7;
    private String id8;

    public void setGetseries(Double id7) {
        this.id7 = id7;

        js.append(String.format(Locale.US, "chart.getSeries(%f);", id7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getSeries(%f);", id7));
            js.setLength(0);
        }
    }


    public void setGetseries(String id8) {
        this.id8 = id8;

        js.append(String.format(Locale.US, "chart.getSeries(%s);", id8));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getSeries(%s);", id8));
            js.setLength(0);
        }
    }

    private Double index2;

    public void setGetseriesat(Double index2) {
        this.index2 = index2;

        js.append(String.format(Locale.US, "chart.getSeriesAt(%f);", index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getSeriesAt(%f);", index2));
            js.setLength(0);
        }
    }

    private String key;
    private Statistics key1;

    public void setGetstat(String key) {
        this.key = key;

        js.append(String.format(Locale.US, "chart.getStat(%s);", key));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getStat(%s);", key));
            js.setLength(0);
        }
    }


    public void setGetstat(Statistics key1) {
        this.key1 = key1;

        js.append(String.format(Locale.US, "chart.getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double xCoord;
    private Double yCoord;

    public void setGlobaltolocal(Double xCoord, Double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;

        js.append(String.format(Locale.US, "chart.globalToLocal(%f, %f);", xCoord, yCoord));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.globalToLocal(%f, %f);", xCoord, yCoord));
            js.setLength(0);
        }
    }

    private GridsMapSettings getgrids;

    public GridsMapSettings getGrids() {
        if (getgrids == null)
            getgrids = new GridsMapSettings("chart.grids()");

        return getgrids;
    }

    private String grids;
    private Boolean grids1;

    public void setGrids(String grids) {
        this.grids = grids;

        js.append(String.format(Locale.US, "chart.grids(%s);", grids));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grids(%s);", grids));
            js.setLength(0);
        }
    }


    public void setGrids(Boolean grids1) {
        this.grids1 = grids1;

        js.append(String.format(Locale.US, "chart.grids(%b);", grids1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grids(%b);", grids1));
            js.setLength(0);
        }
    }

    private HatchFills gethatchFillPalette;

    public HatchFills getHatchfillpalette() {
        if (gethatchFillPalette == null)
            gethatchFillPalette = new HatchFills("chart.hatchFillPalette()");

        return gethatchFillPalette;
    }

    private HatchFillType[] hatchFillPalette;
    private String hatchFillPalette1;
    private HatchFills hatchFillPalette2;

    public void setHatchfillpalette(HatchFillType[] hatchFillPalette) {
        this.hatchFillPalette = hatchFillPalette;

        js.append(String.format(Locale.US, "chart.hatchFillPalette(%s);", arrayToString(hatchFillPalette)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFillPalette(%s);", arrayToString(hatchFillPalette)));
            js.setLength(0);
        }
    }


    public void setHatchfillpalette(String hatchFillPalette1) {
        this.hatchFillPalette1 = hatchFillPalette1;

        js.append(String.format(Locale.US, "chart.hatchFillPalette(%s);", hatchFillPalette1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFillPalette(%s);", hatchFillPalette1));
            js.setLength(0);
        }
    }


    public void setHatchfillpalette(HatchFills hatchFillPalette2) {
        this.hatchFillPalette2 = hatchFillPalette2;

        js.append(String.format(Locale.US, "chart.hatchFillPalette(%s);", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFillPalette(%s);", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double height2;
    private String height3;

    public void setHeight(Double height2) {
        this.height2 = height2;

        js.append(String.format(Locale.US, "chart.height(%f);", height2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.height(%f);", height2));
            js.setLength(0);
        }
    }


    public void setHeight(String height3) {
        this.height3 = height3;

        js.append(String.format(Locale.US, "chart.height(%s);", height3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.height(%s);", height3));
            js.setLength(0);
        }
    }

    private UiLabelsFactory gethoverLabels;

    public UiLabelsFactory getHoverlabels() {
        if (gethoverLabels == null)
            gethoverLabels = new UiLabelsFactory("chart.hoverLabels()");

        return gethoverLabels;
    }

    private String hoverLabels;
    private Boolean hoverLabels1;

    public void setHoverlabels(String hoverLabels) {
        this.hoverLabels = hoverLabels;

        js.append(String.format(Locale.US, "chart.hoverLabels(%s);", hoverLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverLabels(%s);", hoverLabels));
            js.setLength(0);
        }
    }


    public void setHoverlabels(Boolean hoverLabels1) {
        this.hoverLabels1 = hoverLabels1;

        js.append(String.format(Locale.US, "chart.hoverLabels(%b);", hoverLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverLabels(%b);", hoverLabels1));
            js.setLength(0);
        }
    }

    private String interactivity;
    private HoverMode interactivity1;

    public void setInteractivity(String interactivity) {
        this.interactivity = interactivity;

        js.append(String.format(Locale.US, "chart.interactivity(%s);", interactivity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.interactivity(%s);", interactivity));
            js.setLength(0);
        }
    }


    public void setInteractivity(HoverMode interactivity1) {
        this.interactivity1 = interactivity1;

        js.append(String.format(Locale.US, "chart.interactivity(%s);", (interactivity1 != null) ? interactivity1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.interactivity(%s);", (interactivity1 != null) ? interactivity1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double x2;
    private Double y2;

    public void setInversetransform(Double x2, Double y2) {
        this.x2 = x2;
        this.y2 = y2;

        js.append(String.format(Locale.US, "chart.inverseTransform(%f, %f);", x2, y2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.inverseTransform(%f, %f);", x2, y2));
            js.setLength(0);
        }
    }

    private String index3;
    private Double index4;

    public void setLabel(String index3) {
        this.index3 = index3;

        js.append(String.format(Locale.US, "chart.label(%s);", index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s);", index3));
            js.setLength(0);
        }
    }


    public void setLabel(Double index4) {
        this.index4 = index4;

        js.append(String.format(Locale.US, "chart.label(%f);", index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f);", index4));
            js.setLength(0);
        }
    }

    private Boolean label;
    private String label1;
    private String label2;

    public void setLabel(Boolean label) {
        this.label = label;

        js.append(String.format(Locale.US, "chart.label(%b);", label));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%b);", label));
            js.setLength(0);
        }
    }

    private String index5;
    private Double index6;
    private Boolean label3;
    private String label4;
    private String label5;

    public void setLabel(String index5, Boolean label3) {
        this.index5 = index5;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%s, %b);", index5, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %b);", index5, label3));
            js.setLength(0);
        }
    }


    public void setLabel(String index5, String label4) {
        this.index5 = index5;
        this.label4 = label4;

        js.append(String.format(Locale.US, "chart.label(%s, %s);", index5, label4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %s);", index5, label4));
            js.setLength(0);
        }
    }


    public void setLabel(Double index6, Boolean label3) {
        this.index6 = index6;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%f, %b);", index6, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %b);", index6, label3));
            js.setLength(0);
        }
    }


    public void setLabel(Double index6, String label4) {
        this.index6 = index6;
        this.label4 = label4;

        js.append(String.format(Locale.US, "chart.label(%f, %s);", index6, label4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %s);", index6, label4));
            js.setLength(0);
        }
    }

    private UiLabelsFactory getlabels;

    public UiLabelsFactory getLabels() {
        if (getlabels == null)
            getlabels = new UiLabelsFactory("chart.labels()");

        return getlabels;
    }

    private String labels;
    private Boolean labels1;

    public void setLabels(String labels) {
        this.labels = labels;

        js.append(String.format(Locale.US, "chart.labels(%s);", labels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.labels(%s);", labels));
            js.setLength(0);
        }
    }


    public void setLabels(Boolean labels1) {
        this.labels1 = labels1;

        js.append(String.format(Locale.US, "chart.labels(%b);", labels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.labels(%b);", labels1));
            js.setLength(0);
        }
    }

    private Double left;
    private String left1;

    public void setLeft(Double left) {
        this.left = left;

        js.append(String.format(Locale.US, "chart.left(%f);", left));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.left(%f);", left));
            js.setLength(0);
        }
    }


    public void setLeft(String left1) {
        this.left1 = left1;

        js.append(String.format(Locale.US, "chart.left(%s);", left1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.left(%s);", left1));
            js.setLength(0);
        }
    }

    private UiLegend getlegend;

    public UiLegend getLegend() {
        if (getlegend == null)
            getlegend = new UiLegend("chart.legend()");

        return getlegend;
    }

    private String legend;
    private Boolean legend1;

    public void setLegend(String legend) {
        this.legend = legend;

        js.append(String.format(Locale.US, "chart.legend(%s);", legend));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.legend(%s);", legend));
            js.setLength(0);
        }
    }


    public void setLegend(Boolean legend1) {
        this.legend1 = legend1;

        js.append(String.format(Locale.US, "chart.legend(%b);", legend1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.legend(%b);", legend1));
            js.setLength(0);
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        this.type = type;
        this.useCapture = useCapture;
        this.listenerScope = listenerScope;

        js.append(String.format(Locale.US, "chart.listen(%s, %b, %s);", type, useCapture, listenerScope));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.listen(%s, %b, %s);", type, useCapture, listenerScope));
            js.setLength(0);
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        this.type1 = type1;
        this.useCapture1 = useCapture1;
        this.listenerScope1 = listenerScope1;

        js.append(String.format(Locale.US, "chart.listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
            js.setLength(0);
        }
    }

    private Double xCoord1;
    private Double yCoord1;

    public void setLocaltoglobal(Double xCoord1, Double yCoord1) {
        this.xCoord1 = xCoord1;
        this.yCoord1 = yCoord1;

        js.append(String.format(Locale.US, "chart.localToGlobal(%f, %f);", xCoord1, yCoord1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.localToGlobal(%f, %f);", xCoord1, yCoord1));
            js.setLength(0);
        }
    }

    private Margin getmargin;

    public Margin getMargin() {
        if (getmargin == null)
            getmargin = new Margin("chart.margin()");

        return getmargin;
    }

    private Double[] margin;
    private String[] margin1;
    private String margin2;

    public void setMargin(Double[] margin) {
        this.margin = margin;

        js.append(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin)));
            js.setLength(0);
        }
    }


    public void setMargin(String[] margin1) {
        this.margin1 = margin1;

        js.append(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin1)));
            js.setLength(0);
        }
    }


    public void setMargin(String margin2) {
        this.margin2 = margin2;

        js.append(String.format(Locale.US, "chart.margin(%s);", margin2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s);", margin2));
            js.setLength(0);
        }
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    public void setMargin(String value6, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        this.value6 = value6;
        this.value = value;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;

        js.append(String.format(Locale.US, "chart.margin(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));
            js.setLength(0);
        }
    }


    public void setMargin(Double value7, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        this.value7 = value7;
        this.value = value;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;

        js.append(String.format(Locale.US, "chart.margin(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));
            js.setLength(0);
        }
    }

    private View data14;
    private Set data15;
    private String[] data16;
    private String data17;
    private TextParsingMode csvSettings6;
    private TextParsingSettings csvSettings7;

    public void setMarker(View data14, TextParsingMode csvSettings6) {
        this.data14 = data14;
        this.csvSettings6 = csvSettings6;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", (data14 != null) ? data14.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", (data14 != null) ? data14.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(View data14, TextParsingSettings csvSettings7) {
        this.data14 = data14;
        this.csvSettings7 = csvSettings7;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", (data14 != null) ? data14.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", (data14 != null) ? data14.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(Set data15, TextParsingMode csvSettings6) {
        this.data15 = data15;
        this.csvSettings6 = csvSettings6;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(Set data15, TextParsingSettings csvSettings7) {
        this.data15 = data15;
        this.csvSettings7 = csvSettings7;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(String[] data16, TextParsingMode csvSettings6) {
        this.data16 = data16;
        this.csvSettings6 = csvSettings6;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", Arrays.toString(data16), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", Arrays.toString(data16), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(String[] data16, TextParsingSettings csvSettings7) {
        this.data16 = data16;
        this.csvSettings7 = csvSettings7;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", Arrays.toString(data16), (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", Arrays.toString(data16), (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(String data17, TextParsingMode csvSettings6) {
        this.data17 = data17;
        this.csvSettings6 = csvSettings6;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", data17, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", data17, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(String data17, TextParsingSettings csvSettings7) {
        this.data17 = data17;
        this.csvSettings7 = csvSettings7;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", data17, (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", data17, (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Markers getmarkerPalette;

    public Markers getMarkerpalette() {
        if (getmarkerPalette == null)
            getmarkerPalette = new Markers("chart.markerPalette()");

        return getmarkerPalette;
    }

    private Markers markerPalette;
    private String markerPalette1;
    private MarkerType[] markerPalette2;

    public void setMarkerpalette(Markers markerPalette) {
        this.markerPalette = markerPalette;

        js.append(String.format(Locale.US, "chart.markerPalette(%s);", (markerPalette != null) ? markerPalette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markerPalette(%s);", (markerPalette != null) ? markerPalette.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarkerpalette(String markerPalette1) {
        this.markerPalette1 = markerPalette1;

        js.append(String.format(Locale.US, "chart.markerPalette(%s);", markerPalette1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markerPalette(%s);", markerPalette1));
            js.setLength(0);
        }
    }


    public void setMarkerpalette(MarkerType[] markerPalette2) {
        this.markerPalette2 = markerPalette2;

        js.append(String.format(Locale.US, "chart.markerPalette(%s);", arrayToString(markerPalette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markerPalette(%s);", arrayToString(markerPalette2)));
            js.setLength(0);
        }
    }

    private Double maxBubbleSize;
    private String maxBubbleSize1;

    public void setMaxbubblesize(Double maxBubbleSize) {
        this.maxBubbleSize = maxBubbleSize;

        js.append(String.format(Locale.US, "chart.maxBubbleSize(%f);", maxBubbleSize));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxBubbleSize(%f);", maxBubbleSize));
            js.setLength(0);
        }
    }


    public void setMaxbubblesize(String maxBubbleSize1) {
        this.maxBubbleSize1 = maxBubbleSize1;

        js.append(String.format(Locale.US, "chart.maxBubbleSize(%s);", maxBubbleSize1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxBubbleSize(%s);", maxBubbleSize1));
            js.setLength(0);
        }
    }

    private Double maxHeight;
    private String maxHeight1;

    public void setMaxheight(Double maxHeight) {
        this.maxHeight = maxHeight;

        js.append(String.format(Locale.US, "chart.maxHeight(%f);", maxHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxHeight(%f);", maxHeight));
            js.setLength(0);
        }
    }


    public void setMaxheight(String maxHeight1) {
        this.maxHeight1 = maxHeight1;

        js.append(String.format(Locale.US, "chart.maxHeight(%s);", maxHeight1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxHeight(%s);", maxHeight1));
            js.setLength(0);
        }
    }

    private Double maxWidth;
    private String maxWidth1;

    public void setMaxwidth(Double maxWidth) {
        this.maxWidth = maxWidth;

        js.append(String.format(Locale.US, "chart.maxWidth(%f);", maxWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxWidth(%f);", maxWidth));
            js.setLength(0);
        }
    }


    public void setMaxwidth(String maxWidth1) {
        this.maxWidth1 = maxWidth1;

        js.append(String.format(Locale.US, "chart.maxWidth(%s);", maxWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxWidth(%s);", maxWidth1));
            js.setLength(0);
        }
    }

    private Double maxZoomLevel;

    public void setMaxzoomlevel(Double maxZoomLevel) {
        this.maxZoomLevel = maxZoomLevel;

        js.append(String.format(Locale.US, "chart.maxZoomLevel(%f);", maxZoomLevel));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxZoomLevel(%f);", maxZoomLevel));
            js.setLength(0);
        }
    }

    private Double minBubbleSize;
    private String minBubbleSize1;

    public void setMinbubblesize(Double minBubbleSize) {
        this.minBubbleSize = minBubbleSize;

        js.append(String.format(Locale.US, "chart.minBubbleSize(%f);", minBubbleSize));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minBubbleSize(%f);", minBubbleSize));
            js.setLength(0);
        }
    }


    public void setMinbubblesize(String minBubbleSize1) {
        this.minBubbleSize1 = minBubbleSize1;

        js.append(String.format(Locale.US, "chart.minBubbleSize(%s);", minBubbleSize1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minBubbleSize(%s);", minBubbleSize1));
            js.setLength(0);
        }
    }

    private Double minHeight;
    private String minHeight1;

    public void setMinheight(Double minHeight) {
        this.minHeight = minHeight;

        js.append(String.format(Locale.US, "chart.minHeight(%f);", minHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minHeight(%f);", minHeight));
            js.setLength(0);
        }
    }


    public void setMinheight(String minHeight1) {
        this.minHeight1 = minHeight1;

        js.append(String.format(Locale.US, "chart.minHeight(%s);", minHeight1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minHeight(%s);", minHeight1));
            js.setLength(0);
        }
    }

    private Double minWidth;
    private String minWidth1;

    public void setMinwidth(Double minWidth) {
        this.minWidth = minWidth;

        js.append(String.format(Locale.US, "chart.minWidth(%f);", minWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minWidth(%f);", minWidth));
            js.setLength(0);
        }
    }


    public void setMinwidth(String minWidth1) {
        this.minWidth1 = minWidth1;

        js.append(String.format(Locale.US, "chart.minWidth(%s);", minWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minWidth(%s);", minWidth1));
            js.setLength(0);
        }
    }

    private Double dx1;
    private Double dy1;

    public void setMove(Double dx1, Double dy1) {
        this.dx1 = dx1;
        this.dy1 = dy1;

        js.append(String.format(Locale.US, "chart.move(%f, %f);", dx1, dy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.move(%f, %f);", dx1, dy1));
            js.setLength(0);
        }
    }

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;
    private Boolean overlapMode2;

    public void setOverlapmode(LabelsOverlapMode overlapMode) {
        this.overlapMode = overlapMode;

        js.append(String.format(Locale.US, "chart.overlapMode(%s);", (overlapMode != null) ? overlapMode.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.overlapMode(%s);", (overlapMode != null) ? overlapMode.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setOverlapmode(String overlapMode1) {
        this.overlapMode1 = overlapMode1;

        js.append(String.format(Locale.US, "chart.overlapMode(%s);", overlapMode1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.overlapMode(%s);", overlapMode1));
            js.setLength(0);
        }
    }


    public void setOverlapmode(Boolean overlapMode2) {
        this.overlapMode2 = overlapMode2;

        js.append(String.format(Locale.US, "chart.overlapMode(%b);", overlapMode2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.overlapMode(%b);", overlapMode2));
            js.setLength(0);
        }
    }

    private UtilsPadding getpadding;

    public UtilsPadding getPadding() {
        if (getpadding == null)
            getpadding = new UtilsPadding("chart.padding()");

        return getpadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;

    public void setPadding(Double[] padding) {
        this.padding = padding;

        js.append(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding)));
            js.setLength(0);
        }
    }


    public void setPadding(String[] padding1) {
        this.padding1 = padding1;

        js.append(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding1)));
            js.setLength(0);
        }
    }


    public void setPadding(String padding2) {
        this.padding2 = padding2;

        js.append(String.format(Locale.US, "chart.padding(%s);", padding2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s);", padding2));
            js.setLength(0);
        }
    }

    private String value8;
    private Double value9;
    private String value10;
    private Double value11;
    private String value12;
    private Double value13;
    private String value14;
    private Double value15;

    public void setPadding(String value14, String value8, Double value9, String value10, Double value11, String value12, Double value13) {
        this.value14 = value14;
        this.value8 = value8;
        this.value9 = value9;
        this.value10 = value10;
        this.value11 = value11;
        this.value12 = value12;
        this.value13 = value13;

        js.append(String.format(Locale.US, "chart.padding(%s, %s, %f, %s, %f, %s, %f);", value14, value8, value9, value10, value11, value12, value13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %s, %f, %s, %f, %s, %f);", value14, value8, value9, value10, value11, value12, value13));
            js.setLength(0);
        }
    }


    public void setPadding(Double value15, String value8, Double value9, String value10, Double value11, String value12, Double value13) {
        this.value15 = value15;
        this.value8 = value8;
        this.value9 = value9;
        this.value10 = value10;
        this.value11 = value11;
        this.value12 = value12;
        this.value13 = value13;

        js.append(String.format(Locale.US, "chart.padding(%f, %s, %f, %s, %f, %s, %f);", value15, value8, value9, value10, value11, value12, value13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %s, %f, %s, %f, %s, %f);", value15, value8, value9, value10, value11, value12, value13));
            js.setLength(0);
        }
    }

    private RangeColors getpalette;

    public RangeColors getPalette() {
        if (getpalette == null)
            getpalette = new RangeColors("chart.palette()");

        return getpalette;
    }

    private RangeColors palette;
    private DistinctColors palette1;
    private String palette2;
    private String[] palette3;

    public void setPalette(RangeColors palette) {
        this.palette = palette;

        js.append(String.format(Locale.US, "chart.palette(%s);", (palette != null) ? palette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", (palette != null) ? palette.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setPalette(DistinctColors palette1) {
        this.palette1 = palette1;

        js.append(String.format(Locale.US, "chart.palette(%s);", (palette1 != null) ? palette1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", (palette1 != null) ? palette1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setPalette(String palette2) {
        this.palette2 = palette2;

        js.append(String.format(Locale.US, "chart.palette(%s);", palette2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", palette2));
            js.setLength(0);
        }
    }


    public void setPalette(String[] palette3) {
        this.palette3 = palette3;

        js.append(String.format(Locale.US, "chart.palette(%s);", Arrays.toString(palette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", Arrays.toString(palette3)));
            js.setLength(0);
        }
    }

    private PaperSize paperSizeOrOptions;
    private String paperSizeOrOptions1;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        this.paperSizeOrOptions = paperSizeOrOptions;
        this.landscape = landscape;

        js.append(String.format(Locale.US, "chart.print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));
            js.setLength(0);
        }
    }


    public void setPrint(String paperSizeOrOptions1, Boolean landscape) {
        this.paperSizeOrOptions1 = paperSizeOrOptions1;
        this.landscape = landscape;

        js.append(String.format(Locale.US, "chart.print(%s, %b);", paperSizeOrOptions1, landscape));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.print(%s, %b);", paperSizeOrOptions1, landscape));
            js.setLength(0);
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type2 = type2;

        js.append(String.format(Locale.US, "chart.removeAllListeners(%s);", type2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeAllListeners(%s);", type2));
            js.setLength(0);
        }
    }

    private Double id9;
    private String id10;

    public void setRemoveseries(Double id9) {
        this.id9 = id9;

        js.append(String.format(Locale.US, "chart.removeSeries(%f);", id9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeSeries(%f);", id9));
            js.setLength(0);
        }
    }


    public void setRemoveseries(String id10) {
        this.id10 = id10;

        js.append(String.format(Locale.US, "chart.removeSeries(%s);", id10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeSeries(%s);", id10));
            js.setLength(0);
        }
    }

    private Double index7;

    public void setRemoveseriesat(Double index7) {
        this.index7 = index7;

        js.append(String.format(Locale.US, "chart.removeSeriesAt(%f);", index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeSeriesAt(%f);", index7));
            js.setLength(0);
        }
    }

    private Double right;
    private String right1;

    public void setRight(Double right) {
        this.right = right;

        js.append(String.format(Locale.US, "chart.right(%f);", right));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.right(%f);", right));
            js.setLength(0);
        }
    }


    public void setRight(String right1) {
        this.right1 = right1;

        js.append(String.format(Locale.US, "chart.right(%s);", right1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.right(%s);", right1));
            js.setLength(0);
        }
    }

    private String chartDataExportMode;
    private ChartDataExportMode chartDataExportMode1;
    private String csvSettings8;
    private String filename;

    public void setSaveascsv(String chartDataExportMode, String csvSettings8, String filename) {
        this.chartDataExportMode = chartDataExportMode;
        this.csvSettings8 = csvSettings8;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings8, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings8, filename));
            js.setLength(0);
        }
    }


    public void setSaveascsv(ChartDataExportMode chartDataExportMode1, String csvSettings8, String filename) {
        this.chartDataExportMode1 = chartDataExportMode1;
        this.csvSettings8 = csvSettings8;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings8, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings8, filename));
            js.setLength(0);
        }
    }

    private Double width2;
    private String width3;
    private Double height4;
    private Double quality;
    private Boolean forceTransparentWhite;
    private String filename1;

    public void setSaveasjpg(Double width2, Double height4, Double quality, Boolean forceTransparentWhite, String filename1) {
        this.width2 = width2;
        this.height4 = height4;
        this.quality = quality;
        this.forceTransparentWhite = forceTransparentWhite;
        this.filename1 = filename1;

        js.append(String.format(Locale.US, "chart.saveAsJpg(%f, %f, %f, %b, %s);", width2, height4, quality, forceTransparentWhite, filename1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsJpg(%f, %f, %f, %b, %s);", width2, height4, quality, forceTransparentWhite, filename1));
            js.setLength(0);
        }
    }


    public void setSaveasjpg(String width3, Double height4, Double quality, Boolean forceTransparentWhite, String filename1) {
        this.width3 = width3;
        this.height4 = height4;
        this.quality = quality;
        this.forceTransparentWhite = forceTransparentWhite;
        this.filename1 = filename1;

        js.append(String.format(Locale.US, "chart.saveAsJpg(%s, %f, %f, %b, %s);", width3, height4, quality, forceTransparentWhite, filename1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsJpg(%s, %f, %f, %b, %s);", width3, height4, quality, forceTransparentWhite, filename1));
            js.setLength(0);
        }
    }

    private Boolean includeTheme;
    private String filename2;

    public void setSaveasjson(Boolean includeTheme, String filename2) {
        this.includeTheme = includeTheme;
        this.filename2 = filename2;

        js.append(String.format(Locale.US, "chart.saveAsJson(%b, %s);", includeTheme, filename2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsJson(%b, %s);", includeTheme, filename2));
            js.setLength(0);
        }
    }

    private Double paperSizeOrWidthOrOptions;
    private String paperSizeOrWidthOrOptions1;
    private String paperSizeOrWidthOrOptions2;
    private Boolean landscape1;
    private Double x3;
    private Double y3;
    private String filename3;

    public void setSaveaspdf(Double paperSizeOrWidthOrOptions, Boolean landscape1, Double x3, Double y3, String filename3) {
        this.paperSizeOrWidthOrOptions = paperSizeOrWidthOrOptions;
        this.landscape1 = landscape1;
        this.x3 = x3;
        this.y3 = y3;
        this.filename3 = filename3;

        js.append(String.format(Locale.US, "chart.saveAsPdf(%f, %b, %f, %f, %s);", paperSizeOrWidthOrOptions, landscape1, x3, y3, filename3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPdf(%f, %b, %f, %f, %s);", paperSizeOrWidthOrOptions, landscape1, x3, y3, filename3));
            js.setLength(0);
        }
    }


    public void setSaveaspdf(String paperSizeOrWidthOrOptions1, Boolean landscape1, Double x3, Double y3, String filename3) {
        this.paperSizeOrWidthOrOptions1 = paperSizeOrWidthOrOptions1;
        this.landscape1 = landscape1;
        this.x3 = x3;
        this.y3 = y3;
        this.filename3 = filename3;

        js.append(String.format(Locale.US, "chart.saveAsPdf(%s, %b, %f, %f, %s);", paperSizeOrWidthOrOptions1, landscape1, x3, y3, filename3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPdf(%s, %b, %f, %f, %s);", paperSizeOrWidthOrOptions1, landscape1, x3, y3, filename3));
            js.setLength(0);
        }
    }

    private Double width4;
    private String width5;
    private Double height5;
    private Double quality1;
    private String filename4;

    public void setSaveaspng(Double width4, Double height5, Double quality1, String filename4) {
        this.width4 = width4;
        this.height5 = height5;
        this.quality1 = quality1;
        this.filename4 = filename4;

        js.append(String.format(Locale.US, "chart.saveAsPng(%f, %f, %f, %s);", width4, height5, quality1, filename4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPng(%f, %f, %f, %s);", width4, height5, quality1, filename4));
            js.setLength(0);
        }
    }


    public void setSaveaspng(String width5, Double height5, Double quality1, String filename4) {
        this.width5 = width5;
        this.height5 = height5;
        this.quality1 = quality1;
        this.filename4 = filename4;

        js.append(String.format(Locale.US, "chart.saveAsPng(%s, %f, %f, %s);", width5, height5, quality1, filename4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPng(%s, %f, %f, %s);", width5, height5, quality1, filename4));
            js.setLength(0);
        }
    }

    private String paperSize;
    private String paperSize1;
    private Boolean landscape2;
    private String filename5;

    public void setSaveassvg(String paperSize, Boolean landscape2, String filename5) {
        this.paperSize = paperSize;
        this.landscape2 = landscape2;
        this.filename5 = filename5;

        js.append(String.format(Locale.US, "chart.saveAsSvg(%s, %b, %s);", paperSize, landscape2, filename5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsSvg(%s, %b, %s);", paperSize, landscape2, filename5));
            js.setLength(0);
        }
    }

    private Double width6;
    private Double height6;

    public void setSaveassvg(Double width6, Double height6) {
        this.width6 = width6;
        this.height6 = height6;

        js.append(String.format(Locale.US, "chart.saveAsSvg(%f, %f);", width6, height6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsSvg(%f, %f);", width6, height6));
            js.setLength(0);
        }
    }

    private String chartDataExportMode2;
    private ChartDataExportMode chartDataExportMode3;
    private String filename6;

    public void setSaveasxlsx(String chartDataExportMode2, String filename6) {
        this.chartDataExportMode2 = chartDataExportMode2;
        this.filename6 = filename6;

        js.append(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", chartDataExportMode2, filename6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", chartDataExportMode2, filename6));
            js.setLength(0);
        }
    }


    public void setSaveasxlsx(ChartDataExportMode chartDataExportMode3, String filename6) {
        this.chartDataExportMode3 = chartDataExportMode3;
        this.filename6 = filename6;

        js.append(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null", filename6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null", filename6));
            js.setLength(0);
        }
    }

    private Boolean includeTheme1;
    private String filename7;

    public void setSaveasxml(Boolean includeTheme1, String filename7) {
        this.includeTheme1 = includeTheme1;
        this.filename7 = filename7;

        js.append(String.format(Locale.US, "chart.saveAsXml(%b, %s);", includeTheme1, filename7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXml(%b, %s);", includeTheme1, filename7));
            js.setLength(0);
        }
    }

    private UiLabelsFactory getselectLabels;

    public UiLabelsFactory getSelectlabels() {
        if (getselectLabels == null)
            getselectLabels = new UiLabelsFactory("chart.selectLabels()");

        return getselectLabels;
    }

    private String selectLabels;
    private Boolean selectLabels1;

    public void setSelectlabels(String selectLabels) {
        this.selectLabels = selectLabels;

        js.append(String.format(Locale.US, "chart.selectLabels(%s);", selectLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectLabels(%s);", selectLabels));
            js.setLength(0);
        }
    }


    public void setSelectlabels(Boolean selectLabels1) {
        this.selectLabels1 = selectLabels1;

        js.append(String.format(Locale.US, "chart.selectLabels(%b);", selectLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectLabels(%b);", selectLabels1));
            js.setLength(0);
        }
    }

    private Fill selectMarqueeFill;

    public void setSelectmarqueefill(Fill selectMarqueeFill) {
        this.selectMarqueeFill = selectMarqueeFill;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color;
    private Double opacity;

    public void setSelectmarqueefill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color, opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color, opacity));
            js.setLength(0);
        }
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    public void setSelectmarqueefill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys1, String mode2, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));
            js.setLength(0);
        }
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setSelectmarqueefill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }

    private Fill imageSettings;
    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setSelectmarqueestroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color1 = color1;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color2 = color2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color3 = color3;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean repeat;

    public void setStartselectmarquee(Boolean repeat) {
        this.repeat = repeat;

        js.append(String.format(Locale.US, "chart.startSelectMarquee(%b);", repeat));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.startSelectMarquee(%b);", repeat));
            js.setLength(0);
        }
    }

    private UiTitle gettitle;

    public UiTitle getTitle() {
        if (gettitle == null)
            gettitle = new UiTitle("chart.title()");

        return gettitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

    public void setTitle(Boolean title) {
        this.title = title;

        js.append(String.format(Locale.US, "chart.title(%b);", title));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.title(%b);", title));
            js.setLength(0);
        }
    }


    public void setTitle(String title1) {
        this.title1 = title1;

        js.append(String.format(Locale.US, "chart.title(%s);", title1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.title(%s);", title1));
            js.setLength(0);
        }
    }

    private String chartDataExportMode4;
    private ChartDataExportMode chartDataExportMode5;
    private String csvSettings9;

    public void setTocsv(String chartDataExportMode4, String csvSettings9) {
        this.chartDataExportMode4 = chartDataExportMode4;
        this.csvSettings9 = csvSettings9;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings9));
            js.setLength(0);
        }
    }


    public void setTocsv(ChartDataExportMode chartDataExportMode5, String csvSettings9) {
        this.chartDataExportMode5 = chartDataExportMode5;
        this.csvSettings9 = csvSettings9;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings9));
            js.setLength(0);
        }
    }

    private Boolean stringify;
    private Boolean includeTheme2;

    public void setTojson(Boolean stringify, Boolean includeTheme2) {
        this.stringify = stringify;
        this.includeTheme2 = includeTheme2;

        js.append(String.format(Locale.US, "chart.toJson(%b, %b);", stringify, includeTheme2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toJson(%b, %b);", stringify, includeTheme2));
            js.setLength(0);
        }
    }

    private String paperSize2;
    private String paperSize3;
    private Boolean landscape3;

    public void setTosvg(String paperSize2, Boolean landscape3) {
        this.paperSize2 = paperSize2;
        this.landscape3 = landscape3;

        js.append(String.format(Locale.US, "chart.toSvg(%s, %b);", paperSize2, landscape3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toSvg(%s, %b);", paperSize2, landscape3));
            js.setLength(0);
        }
    }

    private Double width7;
    private Double height7;

    public void setTosvg(Double width7, Double height7) {
        this.width7 = width7;
        this.height7 = height7;

        js.append(String.format(Locale.US, "chart.toSvg(%f, %f);", width7, height7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toSvg(%f, %f);", width7, height7));
            js.setLength(0);
        }
    }

    private Boolean asXmlNode;
    private Boolean includeTheme3;

    public void setToxml(Boolean asXmlNode, Boolean includeTheme3) {
        this.asXmlNode = asXmlNode;
        this.includeTheme3 = includeTheme3;

        js.append(String.format(Locale.US, "chart.toXml(%b, %b);", asXmlNode, includeTheme3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toXml(%b, %b);", asXmlNode, includeTheme3));
            js.setLength(0);
        }
    }

    private Tooltip gettooltip;

    public Tooltip getTooltip() {
        if (gettooltip == null)
            gettooltip = new Tooltip("chart.tooltip()");

        return gettooltip;
    }

    private String tooltip;
    private Boolean tooltip1;

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;

        js.append(String.format(Locale.US, "chart.tooltip(%s);", tooltip));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.tooltip(%s);", tooltip));
            js.setLength(0);
        }
    }


    public void setTooltip(Boolean tooltip1) {
        this.tooltip1 = tooltip1;

        js.append(String.format(Locale.US, "chart.tooltip(%b);", tooltip1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.tooltip(%b);", tooltip1));
            js.setLength(0);
        }
    }

    private Double top;
    private String top1;

    public void setTop(Double top) {
        this.top = top;

        js.append(String.format(Locale.US, "chart.top(%f);", top));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.top(%f);", top));
            js.setLength(0);
        }
    }


    public void setTop(String top1) {
        this.top1 = top1;

        js.append(String.format(Locale.US, "chart.top(%s);", top1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.top(%s);", top1));
            js.setLength(0);
        }
    }

    private Double xLong;
    private Double yLat;

    public void setTransform(Double xLong, Double yLat) {
        this.xLong = xLong;
        this.yLat = yLat;

        js.append(String.format(Locale.US, "chart.transform(%f, %f);", xLong, yLat));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.transform(%f, %f);", xLong, yLat));
            js.setLength(0);
        }
    }

    private String id11;
    private Double dx2;
    private Double dy2;

    public void setTranslatefeature(String id11, Double dx2, Double dy2) {
        this.id11 = id11;
        this.dx2 = dx2;
        this.dy2 = dy2;

        js.append(String.format(Locale.US, "chart.translateFeature(%s, %f, %f);", id11, dx2, dy2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.translateFeature(%s, %f, %f);", id11, dx2, dy2));
            js.setLength(0);
        }
    }

    private UnboundRegionsSettings getunboundRegions;

    public UnboundRegionsSettings getUnboundregions() {
        if (getunboundRegions == null)
            getunboundRegions = new UnboundRegionsSettings("chart.unboundRegions()");

        return getunboundRegions;
    }

    private String unboundRegions;
    private MapUnboundRegionsMode unboundRegions1;
    private String unboundRegions2;
    private Boolean unboundRegions3;

    public void setUnboundregions(String unboundRegions) {
        this.unboundRegions = unboundRegions;

        js.append(String.format(Locale.US, "chart.unboundRegions(%s);", unboundRegions));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unboundRegions(%s);", unboundRegions));
            js.setLength(0);
        }
    }


    public void setUnboundregions(MapUnboundRegionsMode unboundRegions1) {
        this.unboundRegions1 = unboundRegions1;

        js.append(String.format(Locale.US, "chart.unboundRegions(%s);", (unboundRegions1 != null) ? unboundRegions1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unboundRegions(%s);", (unboundRegions1 != null) ? unboundRegions1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setUnboundregions(Boolean unboundRegions3) {
        this.unboundRegions3 = unboundRegions3;

        js.append(String.format(Locale.US, "chart.unboundRegions(%b);", unboundRegions3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unboundRegions(%b);", unboundRegions3));
            js.setLength(0);
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        this.type3 = type3;
        this.useCapture2 = useCapture2;
        this.listenerScope2 = listenerScope2;

        js.append(String.format(Locale.US, "chart.unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
            js.setLength(0);
        }
    }

    private String key2;

    public void setUnlistenbykey(String key2) {
        this.key2 = key2;

        js.append(String.format(Locale.US, "chart.unlistenByKey(%s);", key2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unlistenByKey(%s);", key2));
            js.setLength(0);
        }
    }

    private Double width8;
    private String width9;

    public void setWidth(Double width8) {
        this.width8 = width8;

        js.append(String.format(Locale.US, "chart.width(%f);", width8));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.width(%f);", width8));
            js.setLength(0);
        }
    }


    public void setWidth(String width9) {
        this.width9 = width9;

        js.append(String.format(Locale.US, "chart.width(%s);", width9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.width(%s);", width9));
            js.setLength(0);
        }
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;

        js.append(String.format(Locale.US, "chart.zIndex(%f);", zIndex));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zIndex(%f);", zIndex));
            js.setLength(0);
        }
    }

    private Double zoom;
    private Double cx1;
    private Double cy1;
    private Double duration2;

    public void setZoom(Double zoom, Double cx1, Double cy1, Double duration2) {
        this.zoom = zoom;
        this.cx1 = cx1;
        this.cy1 = cy1;
        this.duration2 = duration2;

        js.append(String.format(Locale.US, "chart.zoom(%f, %f, %f, %f);", zoom, cx1, cy1, duration2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoom(%f, %f, %f, %f);", zoom, cx1, cy1, duration2));
            js.setLength(0);
        }
    }

    private Double zoomTo;
    private Double cx2;
    private Double cy2;

    public void setZoomto(Double zoomTo, Double cx2, Double cy2) {
        this.zoomTo = zoomTo;
        this.cx2 = cx2;
        this.cy2 = cy2;

        js.append(String.format(Locale.US, "chart.zoomTo(%f, %f, %f);", zoomTo, cx2, cy2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoomTo(%f, %f, %f);", zoomTo, cx2, cy2));
            js.setLength(0);
        }
    }

    private String id12;

    public void setZoomtofeature(String id12) {
        this.id12 = id12;

        js.append(String.format(Locale.US, "chart.zoomToFeature(%s);", id12));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zoomToFeature(%s);", id12));
            js.setLength(0);
        }
    }

    private String generateJSgetanimation() {
        if (getanimation != null) {
            return getanimation.generateJs();
        }
        return "";
    }

    private String generateJSgetaxes() {
        if (getaxes != null) {
            return getaxes.generateJs();
        }
        return "";
    }

    private String generateJSgetbackground() {
        if (getbackground != null) {
            return getbackground.generateJs();
        }
        return "";
    }

    private String generateJSgetbounds() {
        if (getbounds != null) {
            return getbounds.generateJs();
        }
        return "";
    }

    private String generateJSgetcolorRange() {
        if (getcolorRange != null) {
            return getcolorRange.generateJs();
        }
        return "";
    }

    private String generateJSgetcontainer() {
        if (getcontainer != null) {
            return getcontainer.generateJs();
        }
        return "";
    }

    private String generateJSgetcontextMenu() {
        if (getcontextMenu != null) {
            return getcontextMenu.generateJs();
        }
        return "";
    }

    private String generateJSgetcredits() {
        if (getcredits != null) {
            return getcredits.generateJs();
        }
        return "";
    }

    private String generateJSgetcrosshair() {
        if (getcrosshair != null) {
            return getcrosshair.generateJs();
        }
        return "";
    }

    private String generateJSgetcrsAnimation() {
        if (getcrsAnimation != null) {
            return getcrsAnimation.generateJs();
        }
        return "";
    }

    private String generateJSgetgetPlotBounds() {
        if (getgetPlotBounds != null) {
            return getgetPlotBounds.generateJs();
        }
        return "";
    }

    private String generateJSgetgrids() {
        if (getgrids != null) {
            return getgrids.generateJs();
        }
        return "";
    }

    private String generateJSgethatchFillPalette() {
        if (gethatchFillPalette != null) {
            return gethatchFillPalette.generateJs();
        }
        return "";
    }

    private String generateJSgethoverLabels() {
        if (gethoverLabels != null) {
            return gethoverLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetlabels() {
        if (getlabels != null) {
            return getlabels.generateJs();
        }
        return "";
    }

    private String generateJSgetlegend() {
        if (getlegend != null) {
            return getlegend.generateJs();
        }
        return "";
    }

    private String generateJSgetmargin() {
        if (getmargin != null) {
            return getmargin.generateJs();
        }
        return "";
    }

    private String generateJSgetmarkerPalette() {
        if (getmarkerPalette != null) {
            return getmarkerPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetpadding() {
        if (getpadding != null) {
            return getpadding.generateJs();
        }
        return "";
    }

    private String generateJSgetpalette() {
        if (getpalette != null) {
            return getpalette.generateJs();
        }
        return "";
    }

    private String generateJSgetselectLabels() {
        if (getselectLabels != null) {
            return getselectLabels.generateJs();
        }
        return "";
    }

    private String generateJSgettitle() {
        if (gettitle != null) {
            return gettitle.generateJs();
        }
        return "";
    }

    private String generateJSgettooltip() {
        if (gettooltip != null) {
            return gettooltip.generateJs();
        }
        return "";
    }

    private String generateJSgetunboundRegions() {
        if (getunboundRegions != null) {
            return getunboundRegions.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append(generateJSgetanimation());
        js.append(generateJSgetaxes());
        js.append(generateJSgetbackground());
        js.append(generateJSgetbounds());
        js.append(generateJSgetcolorRange());
        js.append(generateJSgetcontainer());
        js.append(generateJSgetcontextMenu());
        js.append(generateJSgetcredits());
        js.append(generateJSgetcrosshair());
        js.append(generateJSgetcrsAnimation());
        js.append(generateJSgetgetPlotBounds());
        js.append(generateJSgetgrids());
        js.append(generateJSgethatchFillPalette());
        js.append(generateJSgethoverLabels());
        js.append(generateJSgetlabels());
        js.append(generateJSgetlegend());
        js.append(generateJSgetmargin());
        js.append(generateJSgetmarkerPalette());
        js.append(generateJSgetpadding());
        js.append(generateJSgetpalette());
        js.append(generateJSgetselectLabels());
        js.append(generateJSgettitle());
        js.append(generateJSgettooltip());
        js.append(generateJSgetunboundRegions());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}