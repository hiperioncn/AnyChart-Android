package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Stage extends JsObject {

    
    private Element element;

    public void setAddchild(Element element) {
        this.element = element;
    }

    private Element element1;
    private Double index;

    public void setAddchildat(Element element1, Double index) {
        this.element = null;
        this.element1 = null;
        
        this.element1 = element1;
        this.index = index;
    }

    private Double m;
    private Double m1;
    private Double m2;
    private Double m3;
    private Double m4;
    private Double m5;

    public void setAppendtransformationmatrix(Double m, Double m1, Double m2, Double m3, Double m4, Double m5) {
        this.m = null;
        this.m1 = null;
        this.m2 = null;
        this.m3 = null;
        this.m4 = null;
        this.m5 = null;
        
        this.m = m;
        this.m = null;
        this.m1 = null;
        this.m2 = null;
        this.m3 = null;
        this.m4 = null;
        this.m5 = null;
        
        this.m1 = m1;
        this.m = null;
        this.m1 = null;
        this.m2 = null;
        this.m3 = null;
        this.m4 = null;
        this.m5 = null;
        
        this.m2 = m2;
        this.m = null;
        this.m1 = null;
        this.m2 = null;
        this.m3 = null;
        this.m4 = null;
        this.m5 = null;
        
        this.m3 = m3;
        this.m = null;
        this.m1 = null;
        this.m2 = null;
        this.m3 = null;
        this.m4 = null;
        this.m5 = null;
        
        this.m4 = m4;
        this.m = null;
        this.m1 = null;
        this.m2 = null;
        this.m3 = null;
        this.m4 = null;
        this.m5 = null;
        
        this.m5 = m5;
    }

    private Boolean asyncMode;

    public void setAsyncmode(Boolean asyncMode) {
        this.asyncMode = asyncMode;
    }

    private Double cx;
    private Double cy;
    private Double radius;

    public void setCircle(Double cx, Double cy, Double radius) {
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
    }

    private Rect clip;

    public void setClip(Rect clip) {
        this.clip = clip;
    }

    private Element container;

    public void setContainer(Element container) {
        this.container = container;
    }

    private Double[] rect;
    private Rect rect1;

    public void setCreateclip(Double[] rect) {
        this.rect = null;
        this.rect1 = null;
        
        this.rect = rect;
    }


    public void setCreateclip(Rect rect1) {
        this.rect = null;
        this.rect1 = null;
        
        this.rect1 = rect1;
    }

    private Double left;
    private Double top;
    private Double width;
    private Double height;

    public void setCreateclip(Double left, Double top, Double width, Double height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    private Boolean credits;

    public void setCredits(Boolean credits) {
        this.credits = credits;
    }

    private String desc;

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private Double cx1;
    private Double cy1;
    private Double rx;
    private Double ry;

    public void setEllipse(Double cx1, Double cy1, Double rx, Double ry) {
        this.cx = null;
        this.cx1 = null;
        
        this.cx1 = cx1;
        this.cy = null;
        this.cy1 = null;
        
        this.cy1 = cy1;
        this.rx = rx;
        this.ry = ry;
    }

    private Double index1;

    public void setGetchildat(Double index1) {
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
    }

    private Double width1;
    private Double height1;
    private Double quality;
    private Boolean forceTransparentWhite;

    public void setGetjpgbase64String(Double width1, Double height1, Double quality, Boolean forceTransparentWhite) {
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
        this.quality = quality;
        this.forceTransparentWhite = forceTransparentWhite;
    }

    private Double paperSizeOrWidth;
    private String paperSizeOrWidth1;
    private Double landscapeOrWidth;
    private Boolean landscapeOrWidth1;
    private Double x;
    private Double y;

    public void setGetpdfbase64String(Double paperSizeOrWidth, Double landscapeOrWidth, Double x, Double y) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        
        this.paperSizeOrWidth = paperSizeOrWidth;
        this.landscapeOrWidth = null;
        this.landscapeOrWidth1 = null;
        
        this.landscapeOrWidth = landscapeOrWidth;
        this.x = x;
        this.y = y;
    }


    public void setGetpdfbase64String(Double paperSizeOrWidth, Boolean landscapeOrWidth1, Double x, Double y) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        
        this.paperSizeOrWidth = paperSizeOrWidth;
        this.landscapeOrWidth = null;
        this.landscapeOrWidth1 = null;
        
        this.landscapeOrWidth1 = landscapeOrWidth1;
        this.x = x;
        this.y = y;
    }


    public void setGetpdfbase64String(String paperSizeOrWidth1, Double landscapeOrWidth, Double x, Double y) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        
        this.paperSizeOrWidth1 = paperSizeOrWidth1;
        this.landscapeOrWidth = null;
        this.landscapeOrWidth1 = null;
        
        this.landscapeOrWidth = landscapeOrWidth;
        this.x = x;
        this.y = y;
    }


    public void setGetpdfbase64String(String paperSizeOrWidth1, Boolean landscapeOrWidth1, Double x, Double y) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        
        this.paperSizeOrWidth1 = paperSizeOrWidth1;
        this.landscapeOrWidth = null;
        this.landscapeOrWidth1 = null;
        
        this.landscapeOrWidth1 = landscapeOrWidth1;
        this.x = x;
        this.y = y;
    }

    private Double width2;
    private Double height2;
    private Double quality1;

    public void setGetpngbase64String(Double width2, Double height2, Double quality1) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        
        this.width2 = width2;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        
        this.height2 = height2;
        this.quality = null;
        this.quality1 = null;
        
        this.quality1 = quality1;
    }

    private String paperSizeOrWidth2;
    private Double paperSizeOrWidth3;
    private Boolean landscapeOrHeight;
    private String landscapeOrHeight1;

    public void setGetsvgbase64String(String paperSizeOrWidth2, Boolean landscapeOrHeight) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        
        this.paperSizeOrWidth2 = paperSizeOrWidth2;
        this.landscapeOrHeight = null;
        this.landscapeOrHeight1 = null;
        
        this.landscapeOrHeight = landscapeOrHeight;
    }


    public void setGetsvgbase64String(String paperSizeOrWidth2, String landscapeOrHeight1) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        
        this.paperSizeOrWidth2 = paperSizeOrWidth2;
        this.landscapeOrHeight = null;
        this.landscapeOrHeight1 = null;
        
        this.landscapeOrHeight1 = landscapeOrHeight1;
    }


    public void setGetsvgbase64String(Double paperSizeOrWidth3, Boolean landscapeOrHeight) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        
        this.paperSizeOrWidth3 = paperSizeOrWidth3;
        this.landscapeOrHeight = null;
        this.landscapeOrHeight1 = null;
        
        this.landscapeOrHeight = landscapeOrHeight;
    }


    public void setGetsvgbase64String(Double paperSizeOrWidth3, String landscapeOrHeight1) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        
        this.paperSizeOrWidth3 = paperSizeOrWidth3;
        this.landscapeOrHeight = null;
        this.landscapeOrHeight1 = null;
        
        this.landscapeOrHeight1 = landscapeOrHeight1;
    }

    private Element element2;

    public void setHaschild(Element element2) {
        this.element = null;
        this.element1 = null;
        this.element2 = null;
        
        this.element2 = element2;
    }

    private HatchFillType type;
    private String color;
    private Double thickness;
    private Double size;

    public void setHatchfill(HatchFillType type, String color, Double thickness, Double size) {
        this.type = type;
        this.color = color;
        this.thickness = thickness;
        this.size = size;
    }

    private String height3;
    private Double height4;

    public void setHeight(String height3) {
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        
        this.height3 = height3;
    }


    public void setHeight(Double height4) {
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        
        this.height4 = height4;
    }

    private Double x1;
    private Double y1;
    private String text;

    public void setHtml(Double x1, Double y1, String text) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.text = text;
    }

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    private String src;
    private Double x2;
    private Double y2;
    private Double width3;
    private Double height5;

    public void setImage(String src, Double x2, Double y2, Double width3, Double height5) {
        this.src = src;
        this.x = null;
        this.x1 = null;
        this.x2 = null;
        
        this.x2 = x2;
        this.y = null;
        this.y1 = null;
        this.y2 = null;
        
        this.y2 = y2;
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        
        this.width3 = width3;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        
        this.height5 = height5;
    }

    private Element element3;

    public void setIndexofchild(Element element3) {
        this.element = null;
        this.element1 = null;
        this.element2 = null;
        this.element3 = null;
        
        this.element3 = element3;
    }

    private String type1;
    private Boolean useCapture;

    public void setListen(String type1, Boolean useCapture) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = useCapture;
    }

    private String type2;
    private Boolean useCapture1;

    public void setListenonce(String type2, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private Double maxResizeDelay;

    public void setMaxresizedelay(Double maxResizeDelay) {
        this.maxResizeDelay = maxResizeDelay;
    }

    private Rect bounds;

    public void setPattern(Rect bounds) {
        this.bounds = bounds;
    }

    private String paperSizeOrWidth4;
    private Double paperSizeOrWidth5;
    private Boolean landscapeOrHeight2;
    private String landscapeOrHeight3;

    public void setPrint(String paperSizeOrWidth4, Boolean landscapeOrHeight2) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        this.paperSizeOrWidth4 = null;
        this.paperSizeOrWidth5 = null;
        
        this.paperSizeOrWidth4 = paperSizeOrWidth4;
        this.landscapeOrHeight = null;
        this.landscapeOrHeight1 = null;
        this.landscapeOrHeight2 = null;
        this.landscapeOrHeight3 = null;
        
        this.landscapeOrHeight2 = landscapeOrHeight2;
    }


    public void setPrint(String paperSizeOrWidth4, String landscapeOrHeight3) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        this.paperSizeOrWidth4 = null;
        this.paperSizeOrWidth5 = null;
        
        this.paperSizeOrWidth4 = paperSizeOrWidth4;
        this.landscapeOrHeight = null;
        this.landscapeOrHeight1 = null;
        this.landscapeOrHeight2 = null;
        this.landscapeOrHeight3 = null;
        
        this.landscapeOrHeight3 = landscapeOrHeight3;
    }


    public void setPrint(Double paperSizeOrWidth5, Boolean landscapeOrHeight2) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        this.paperSizeOrWidth4 = null;
        this.paperSizeOrWidth5 = null;
        
        this.paperSizeOrWidth5 = paperSizeOrWidth5;
        this.landscapeOrHeight = null;
        this.landscapeOrHeight1 = null;
        this.landscapeOrHeight2 = null;
        this.landscapeOrHeight3 = null;
        
        this.landscapeOrHeight2 = landscapeOrHeight2;
    }


    public void setPrint(Double paperSizeOrWidth5, String landscapeOrHeight3) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        this.paperSizeOrWidth4 = null;
        this.paperSizeOrWidth5 = null;
        
        this.paperSizeOrWidth5 = paperSizeOrWidth5;
        this.landscapeOrHeight = null;
        this.landscapeOrHeight1 = null;
        this.landscapeOrHeight2 = null;
        this.landscapeOrHeight3 = null;
        
        this.landscapeOrHeight3 = landscapeOrHeight3;
    }

    private Double x3;
    private Double y3;
    private Double width4;
    private Double height6;

    public void setRect(Double x3, Double y3, Double width4, Double height6) {
        this.x = null;
        this.x1 = null;
        this.x2 = null;
        this.x3 = null;
        
        this.x3 = x3;
        this.y = null;
        this.y1 = null;
        this.y2 = null;
        this.y3 = null;
        
        this.y3 = y3;
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        
        this.width4 = width4;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        this.height6 = null;
        
        this.height6 = height6;
    }

    private String type3;

    public void setRemovealllisteners(String type3) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
    }

    private Element element4;

    public void setRemovechild(Element element4) {
        this.element = null;
        this.element1 = null;
        this.element2 = null;
        this.element3 = null;
        this.element4 = null;
        
        this.element4 = element4;
    }

    private Double index2;

    public void setRemovechildat(Double index2) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        
        this.index2 = index2;
    }

    private Double width5;
    private String width6;
    private Double height7;
    private String height8;

    public void setResize(Double width5, Double height7) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        
        this.width5 = width5;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        this.height6 = null;
        this.height7 = null;
        this.height8 = null;
        
        this.height7 = height7;
    }


    public void setResize(Double width5, String height8) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        
        this.width5 = width5;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        this.height6 = null;
        this.height7 = null;
        this.height8 = null;
        
        this.height8 = height8;
    }


    public void setResize(String width6, Double height7) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        
        this.width6 = width6;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        this.height6 = null;
        this.height7 = null;
        this.height8 = null;
        
        this.height7 = height7;
    }


    public void setResize(String width6, String height8) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        
        this.width6 = width6;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        this.height6 = null;
        this.height7 = null;
        this.height8 = null;
        
        this.height8 = height8;
    }

    private Boolean force;

    public void setResume(Boolean force) {
        this.force = force;
    }

    private Double degrees;
    private Double cx2;
    private Double cy2;

    public void setRotate(Double degrees, Double cx2, Double cy2) {
        this.degrees = degrees;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        
        this.cx2 = cx2;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        
        this.cy2 = cy2;
    }

    private Double degrees1;
    private Anchor anchor;
    private String anchor1;

    public void setRotatebyanchor(Anchor anchor, Double degrees1) {
        this.anchor = null;
        this.anchor1 = null;
        
        this.anchor = anchor;
        this.degrees = null;
        this.degrees1 = null;
        
        this.degrees1 = degrees1;
    }


    public void setRotatebyanchor(String anchor1, Double degrees1) {
        this.anchor = null;
        this.anchor1 = null;
        
        this.anchor1 = anchor1;
        this.degrees = null;
        this.degrees1 = null;
        
        this.degrees1 = degrees1;
    }

    private Double width7;
    private Double height9;
    private Double quality2;
    private Boolean forceTransparentWhite1;
    private String filename;

    public void setSaveasjpg(Double width7, Double height9, Double quality2, Boolean forceTransparentWhite1, String filename) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        this.width7 = null;
        
        this.width7 = width7;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        this.height6 = null;
        this.height7 = null;
        this.height8 = null;
        this.height9 = null;
        
        this.height9 = height9;
        this.quality = null;
        this.quality1 = null;
        this.quality2 = null;
        
        this.quality2 = quality2;
        this.forceTransparentWhite = null;
        this.forceTransparentWhite1 = null;
        
        this.forceTransparentWhite1 = forceTransparentWhite1;
        this.filename = filename;
    }

    private String paperSize;
    private Boolean landscape;
    private Double x4;
    private Double y4;
    private String filename1;

    public void setSaveaspdf(String paperSize, Boolean landscape, Double x4, Double y4, String filename1) {
        this.paperSize = paperSize;
        this.landscape = landscape;
        this.x = null;
        this.x1 = null;
        this.x2 = null;
        this.x3 = null;
        this.x4 = null;
        
        this.x4 = x4;
        this.y = null;
        this.y1 = null;
        this.y2 = null;
        this.y3 = null;
        this.y4 = null;
        
        this.y4 = y4;
        this.filename = null;
        this.filename1 = null;
        
        this.filename1 = filename1;
    }

    private Double width8;
    private Double height10;
    private Double quality3;
    private String filename2;

    public void setSaveaspng(Double width8, Double height10, Double quality3, String filename2) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        this.width7 = null;
        this.width8 = null;
        
        this.width8 = width8;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        this.height6 = null;
        this.height7 = null;
        this.height8 = null;
        this.height9 = null;
        this.height10 = null;
        
        this.height10 = height10;
        this.quality = null;
        this.quality1 = null;
        this.quality2 = null;
        this.quality3 = null;
        
        this.quality3 = quality3;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        
        this.filename2 = filename2;
    }

    private String paperSize1;
    private Boolean landscape1;
    private String filename3;

    public void setSaveassvg(String paperSize1, Boolean landscape1, String filename3) {
        this.paperSize = null;
        this.paperSize1 = null;
        
        this.paperSize1 = paperSize1;
        this.landscape = null;
        this.landscape1 = null;
        
        this.landscape1 = landscape1;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        
        this.filename3 = filename3;
    }

    private Double width9;
    private Double height11;

    public void setSaveassvg(Double width9, Double height11) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        this.width7 = null;
        this.width8 = null;
        this.width9 = null;
        
        this.width9 = width9;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        this.height6 = null;
        this.height7 = null;
        this.height8 = null;
        this.height9 = null;
        this.height10 = null;
        this.height11 = null;
        
        this.height11 = height11;
    }

    private Double sx;
    private Double sy;
    private Double cx3;
    private Double cy3;

    public void setScale(Double sx, Double sy, Double cx3, Double cy3) {
        this.sx = sx;
        this.sy = sy;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        
        this.cx3 = cx3;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        
        this.cy3 = cy3;
    }

    private Double sx1;
    private Double sy1;
    private Anchor anchor2;
    private String anchor3;

    public void setScalebyanchor(Anchor anchor2, Double sx1, Double sy1) {
        this.anchor = null;
        this.anchor1 = null;
        this.anchor2 = null;
        this.anchor3 = null;
        
        this.anchor2 = anchor2;
        this.sx = null;
        this.sx1 = null;
        
        this.sx1 = sx1;
        this.sy = null;
        this.sy1 = null;
        
        this.sy1 = sy1;
    }


    public void setScalebyanchor(String anchor3, Double sx1, Double sy1) {
        this.anchor = null;
        this.anchor1 = null;
        this.anchor2 = null;
        this.anchor3 = null;
        
        this.anchor3 = anchor3;
        this.sx = null;
        this.sx1 = null;
        
        this.sx1 = sx1;
        this.sy = null;
        this.sy1 = null;
        
        this.sy1 = sy1;
    }

    private Double x5;
    private Double y5;

    public void setSetposition(Double x5, Double y5) {
        this.x = null;
        this.x1 = null;
        this.x2 = null;
        this.x3 = null;
        this.x4 = null;
        this.x5 = null;
        
        this.x5 = x5;
        this.y = null;
        this.y1 = null;
        this.y2 = null;
        this.y3 = null;
        this.y4 = null;
        this.y5 = null;
        
        this.y5 = y5;
    }

    private Double degrees2;
    private Double cx4;
    private Double cy4;

    public void setSetrotation(Double degrees2, Double cx4, Double cy4) {
        this.degrees = null;
        this.degrees1 = null;
        this.degrees2 = null;
        
        this.degrees2 = degrees2;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        
        this.cx4 = cx4;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        
        this.cy4 = cy4;
    }

    private Double degrees3;
    private Anchor anchor4;
    private String anchor5;

    public void setSetrotationbyanchor(Anchor anchor4, Double degrees3) {
        this.anchor = null;
        this.anchor1 = null;
        this.anchor2 = null;
        this.anchor3 = null;
        this.anchor4 = null;
        this.anchor5 = null;
        
        this.anchor4 = anchor4;
        this.degrees = null;
        this.degrees1 = null;
        this.degrees2 = null;
        this.degrees3 = null;
        
        this.degrees3 = degrees3;
    }


    public void setSetrotationbyanchor(String anchor5, Double degrees3) {
        this.anchor = null;
        this.anchor1 = null;
        this.anchor2 = null;
        this.anchor3 = null;
        this.anchor4 = null;
        this.anchor5 = null;
        
        this.anchor5 = anchor5;
        this.degrees = null;
        this.degrees1 = null;
        this.degrees2 = null;
        this.degrees3 = null;
        
        this.degrees3 = degrees3;
    }

    private Double m6;
    private Double m7;
    private Double m8;
    private Double m9;
    private Double m10;
    private Double m11;

    public void setSettransformationmatrix(Double m6, Double m7, Double m8, Double m9, Double m10, Double m11) {
        this.m = null;
        this.m1 = null;
        this.m2 = null;
        this.m3 = null;
        this.m4 = null;
        this.m5 = null;
        this.m6 = null;
        this.m7 = null;
        this.m8 = null;
        this.m9 = null;
        this.m10 = null;
        this.m11 = null;
        
        this.m6 = m6;
        this.m = null;
        this.m1 = null;
        this.m2 = null;
        this.m3 = null;
        this.m4 = null;
        this.m5 = null;
        this.m6 = null;
        this.m7 = null;
        this.m8 = null;
        this.m9 = null;
        this.m10 = null;
        this.m11 = null;
        
        this.m7 = m7;
        this.m = null;
        this.m1 = null;
        this.m2 = null;
        this.m3 = null;
        this.m4 = null;
        this.m5 = null;
        this.m6 = null;
        this.m7 = null;
        this.m8 = null;
        this.m9 = null;
        this.m10 = null;
        this.m11 = null;
        
        this.m8 = m8;
        this.m = null;
        this.m1 = null;
        this.m2 = null;
        this.m3 = null;
        this.m4 = null;
        this.m5 = null;
        this.m6 = null;
        this.m7 = null;
        this.m8 = null;
        this.m9 = null;
        this.m10 = null;
        this.m11 = null;
        
        this.m9 = m9;
        this.m = null;
        this.m1 = null;
        this.m2 = null;
        this.m3 = null;
        this.m4 = null;
        this.m5 = null;
        this.m6 = null;
        this.m7 = null;
        this.m8 = null;
        this.m9 = null;
        this.m10 = null;
        this.m11 = null;
        
        this.m10 = m10;
        this.m = null;
        this.m1 = null;
        this.m2 = null;
        this.m3 = null;
        this.m4 = null;
        this.m5 = null;
        this.m6 = null;
        this.m7 = null;
        this.m8 = null;
        this.m9 = null;
        this.m10 = null;
        this.m11 = null;
        
        this.m11 = m11;
    }

    private Boolean asBase;
    private Double width10;
    private Double height12;
    private Double quality4;
    private Boolean forceTransparentWhite2;
    private String filename4;

    public void setShareasjpg(Boolean asBase, Double width10, Double height12, Double quality4, Boolean forceTransparentWhite2, String filename4) {
        this.asBase = asBase;
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        this.width7 = null;
        this.width8 = null;
        this.width9 = null;
        this.width10 = null;
        
        this.width10 = width10;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        this.height6 = null;
        this.height7 = null;
        this.height8 = null;
        this.height9 = null;
        this.height10 = null;
        this.height11 = null;
        this.height12 = null;
        
        this.height12 = height12;
        this.quality = null;
        this.quality1 = null;
        this.quality2 = null;
        this.quality3 = null;
        this.quality4 = null;
        
        this.quality4 = quality4;
        this.forceTransparentWhite = null;
        this.forceTransparentWhite1 = null;
        this.forceTransparentWhite2 = null;
        
        this.forceTransparentWhite2 = forceTransparentWhite2;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        
        this.filename4 = filename4;
    }

    private Boolean asBase1;
    private Double paperSizeOrWidth6;
    private String paperSizeOrWidth7;
    private Double landscapeOrWidth2;
    private Boolean landscapeOrWidth3;
    private Double x6;
    private Double y6;
    private String filename5;

    public void setShareaspdf(Double paperSizeOrWidth6, Double landscapeOrWidth2, Boolean asBase1, Double x6, Double y6, String filename5) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        this.paperSizeOrWidth4 = null;
        this.paperSizeOrWidth5 = null;
        this.paperSizeOrWidth6 = null;
        this.paperSizeOrWidth7 = null;
        
        this.paperSizeOrWidth6 = paperSizeOrWidth6;
        this.landscapeOrWidth = null;
        this.landscapeOrWidth1 = null;
        this.landscapeOrWidth2 = null;
        this.landscapeOrWidth3 = null;
        
        this.landscapeOrWidth2 = landscapeOrWidth2;
        this.asBase = null;
        this.asBase1 = null;
        
        this.asBase1 = asBase1;
        this.x = null;
        this.x1 = null;
        this.x2 = null;
        this.x3 = null;
        this.x4 = null;
        this.x5 = null;
        this.x6 = null;
        
        this.x6 = x6;
        this.y = null;
        this.y1 = null;
        this.y2 = null;
        this.y3 = null;
        this.y4 = null;
        this.y5 = null;
        this.y6 = null;
        
        this.y6 = y6;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        this.filename5 = null;
        
        this.filename5 = filename5;
    }


    public void setShareaspdf(Double paperSizeOrWidth6, Boolean landscapeOrWidth3, Boolean asBase1, Double x6, Double y6, String filename5) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        this.paperSizeOrWidth4 = null;
        this.paperSizeOrWidth5 = null;
        this.paperSizeOrWidth6 = null;
        this.paperSizeOrWidth7 = null;
        
        this.paperSizeOrWidth6 = paperSizeOrWidth6;
        this.landscapeOrWidth = null;
        this.landscapeOrWidth1 = null;
        this.landscapeOrWidth2 = null;
        this.landscapeOrWidth3 = null;
        
        this.landscapeOrWidth3 = landscapeOrWidth3;
        this.asBase = null;
        this.asBase1 = null;
        
        this.asBase1 = asBase1;
        this.x = null;
        this.x1 = null;
        this.x2 = null;
        this.x3 = null;
        this.x4 = null;
        this.x5 = null;
        this.x6 = null;
        
        this.x6 = x6;
        this.y = null;
        this.y1 = null;
        this.y2 = null;
        this.y3 = null;
        this.y4 = null;
        this.y5 = null;
        this.y6 = null;
        
        this.y6 = y6;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        this.filename5 = null;
        
        this.filename5 = filename5;
    }


    public void setShareaspdf(String paperSizeOrWidth7, Double landscapeOrWidth2, Boolean asBase1, Double x6, Double y6, String filename5) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        this.paperSizeOrWidth4 = null;
        this.paperSizeOrWidth5 = null;
        this.paperSizeOrWidth6 = null;
        this.paperSizeOrWidth7 = null;
        
        this.paperSizeOrWidth7 = paperSizeOrWidth7;
        this.landscapeOrWidth = null;
        this.landscapeOrWidth1 = null;
        this.landscapeOrWidth2 = null;
        this.landscapeOrWidth3 = null;
        
        this.landscapeOrWidth2 = landscapeOrWidth2;
        this.asBase = null;
        this.asBase1 = null;
        
        this.asBase1 = asBase1;
        this.x = null;
        this.x1 = null;
        this.x2 = null;
        this.x3 = null;
        this.x4 = null;
        this.x5 = null;
        this.x6 = null;
        
        this.x6 = x6;
        this.y = null;
        this.y1 = null;
        this.y2 = null;
        this.y3 = null;
        this.y4 = null;
        this.y5 = null;
        this.y6 = null;
        
        this.y6 = y6;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        this.filename5 = null;
        
        this.filename5 = filename5;
    }


    public void setShareaspdf(String paperSizeOrWidth7, Boolean landscapeOrWidth3, Boolean asBase1, Double x6, Double y6, String filename5) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        this.paperSizeOrWidth4 = null;
        this.paperSizeOrWidth5 = null;
        this.paperSizeOrWidth6 = null;
        this.paperSizeOrWidth7 = null;
        
        this.paperSizeOrWidth7 = paperSizeOrWidth7;
        this.landscapeOrWidth = null;
        this.landscapeOrWidth1 = null;
        this.landscapeOrWidth2 = null;
        this.landscapeOrWidth3 = null;
        
        this.landscapeOrWidth3 = landscapeOrWidth3;
        this.asBase = null;
        this.asBase1 = null;
        
        this.asBase1 = asBase1;
        this.x = null;
        this.x1 = null;
        this.x2 = null;
        this.x3 = null;
        this.x4 = null;
        this.x5 = null;
        this.x6 = null;
        
        this.x6 = x6;
        this.y = null;
        this.y1 = null;
        this.y2 = null;
        this.y3 = null;
        this.y4 = null;
        this.y5 = null;
        this.y6 = null;
        
        this.y6 = y6;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        this.filename5 = null;
        
        this.filename5 = filename5;
    }

    private Boolean asBase2;
    private Double width11;
    private Double height13;
    private Double quality5;
    private String filename6;

    public void setShareaspng(Boolean asBase2, Double width11, Double height13, Double quality5, String filename6) {
        this.asBase = null;
        this.asBase1 = null;
        this.asBase2 = null;
        
        this.asBase2 = asBase2;
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        this.width7 = null;
        this.width8 = null;
        this.width9 = null;
        this.width10 = null;
        this.width11 = null;
        
        this.width11 = width11;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        this.height6 = null;
        this.height7 = null;
        this.height8 = null;
        this.height9 = null;
        this.height10 = null;
        this.height11 = null;
        this.height12 = null;
        this.height13 = null;
        
        this.height13 = height13;
        this.quality = null;
        this.quality1 = null;
        this.quality2 = null;
        this.quality3 = null;
        this.quality4 = null;
        this.quality5 = null;
        
        this.quality5 = quality5;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        this.filename5 = null;
        this.filename6 = null;
        
        this.filename6 = filename6;
    }

    private Boolean asBase3;
    private String paperSizeOrWidth8;
    private Double paperSizeOrWidth9;
    private Boolean landscapeOrHeight4;
    private String landscapeOrHeight5;
    private String filename7;

    public void setShareassvg(String paperSizeOrWidth8, Boolean landscapeOrHeight4, Boolean asBase3, String filename7) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        this.paperSizeOrWidth4 = null;
        this.paperSizeOrWidth5 = null;
        this.paperSizeOrWidth6 = null;
        this.paperSizeOrWidth7 = null;
        this.paperSizeOrWidth8 = null;
        this.paperSizeOrWidth9 = null;
        
        this.paperSizeOrWidth8 = paperSizeOrWidth8;
        this.landscapeOrHeight = null;
        this.landscapeOrHeight1 = null;
        this.landscapeOrHeight2 = null;
        this.landscapeOrHeight3 = null;
        this.landscapeOrHeight4 = null;
        this.landscapeOrHeight5 = null;
        
        this.landscapeOrHeight4 = landscapeOrHeight4;
        this.asBase = null;
        this.asBase1 = null;
        this.asBase2 = null;
        this.asBase3 = null;
        
        this.asBase3 = asBase3;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        this.filename5 = null;
        this.filename6 = null;
        this.filename7 = null;
        
        this.filename7 = filename7;
    }


    public void setShareassvg(String paperSizeOrWidth8, String landscapeOrHeight5, Boolean asBase3, String filename7) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        this.paperSizeOrWidth4 = null;
        this.paperSizeOrWidth5 = null;
        this.paperSizeOrWidth6 = null;
        this.paperSizeOrWidth7 = null;
        this.paperSizeOrWidth8 = null;
        this.paperSizeOrWidth9 = null;
        
        this.paperSizeOrWidth8 = paperSizeOrWidth8;
        this.landscapeOrHeight = null;
        this.landscapeOrHeight1 = null;
        this.landscapeOrHeight2 = null;
        this.landscapeOrHeight3 = null;
        this.landscapeOrHeight4 = null;
        this.landscapeOrHeight5 = null;
        
        this.landscapeOrHeight5 = landscapeOrHeight5;
        this.asBase = null;
        this.asBase1 = null;
        this.asBase2 = null;
        this.asBase3 = null;
        
        this.asBase3 = asBase3;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        this.filename5 = null;
        this.filename6 = null;
        this.filename7 = null;
        
        this.filename7 = filename7;
    }


    public void setShareassvg(Double paperSizeOrWidth9, Boolean landscapeOrHeight4, Boolean asBase3, String filename7) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        this.paperSizeOrWidth4 = null;
        this.paperSizeOrWidth5 = null;
        this.paperSizeOrWidth6 = null;
        this.paperSizeOrWidth7 = null;
        this.paperSizeOrWidth8 = null;
        this.paperSizeOrWidth9 = null;
        
        this.paperSizeOrWidth9 = paperSizeOrWidth9;
        this.landscapeOrHeight = null;
        this.landscapeOrHeight1 = null;
        this.landscapeOrHeight2 = null;
        this.landscapeOrHeight3 = null;
        this.landscapeOrHeight4 = null;
        this.landscapeOrHeight5 = null;
        
        this.landscapeOrHeight4 = landscapeOrHeight4;
        this.asBase = null;
        this.asBase1 = null;
        this.asBase2 = null;
        this.asBase3 = null;
        
        this.asBase3 = asBase3;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        this.filename5 = null;
        this.filename6 = null;
        this.filename7 = null;
        
        this.filename7 = filename7;
    }


    public void setShareassvg(Double paperSizeOrWidth9, String landscapeOrHeight5, Boolean asBase3, String filename7) {
        this.paperSizeOrWidth = null;
        this.paperSizeOrWidth1 = null;
        this.paperSizeOrWidth2 = null;
        this.paperSizeOrWidth3 = null;
        this.paperSizeOrWidth4 = null;
        this.paperSizeOrWidth5 = null;
        this.paperSizeOrWidth6 = null;
        this.paperSizeOrWidth7 = null;
        this.paperSizeOrWidth8 = null;
        this.paperSizeOrWidth9 = null;
        
        this.paperSizeOrWidth9 = paperSizeOrWidth9;
        this.landscapeOrHeight = null;
        this.landscapeOrHeight1 = null;
        this.landscapeOrHeight2 = null;
        this.landscapeOrHeight3 = null;
        this.landscapeOrHeight4 = null;
        this.landscapeOrHeight5 = null;
        
        this.landscapeOrHeight5 = landscapeOrHeight5;
        this.asBase = null;
        this.asBase1 = null;
        this.asBase2 = null;
        this.asBase3 = null;
        
        this.asBase3 = asBase3;
        this.filename = null;
        this.filename1 = null;
        this.filename2 = null;
        this.filename3 = null;
        this.filename4 = null;
        this.filename5 = null;
        this.filename6 = null;
        this.filename7 = null;
        
        this.filename7 = filename7;
    }

    private Element element5;
    private Element element6;

    public void setSwapchildren(Element element5, Element element6) {
        this.element = null;
        this.element1 = null;
        this.element2 = null;
        this.element3 = null;
        this.element4 = null;
        this.element5 = null;
        this.element6 = null;
        
        this.element5 = element5;
        this.element = null;
        this.element1 = null;
        this.element2 = null;
        this.element3 = null;
        this.element4 = null;
        this.element5 = null;
        this.element6 = null;
        
        this.element6 = element6;
    }

    private Double index3;
    private Double index4;

    public void setSwapchildrenat(Double index3, Double index4) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        this.index4 = null;
        
        this.index3 = index3;
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        this.index4 = null;
        
        this.index4 = index4;
    }

    private Double x7;
    private Double y7;
    private String text1;

    public void setText(Double x7, Double y7, String text1) {
        this.x = null;
        this.x1 = null;
        this.x2 = null;
        this.x3 = null;
        this.x4 = null;
        this.x5 = null;
        this.x6 = null;
        this.x7 = null;
        
        this.x7 = x7;
        this.y = null;
        this.y1 = null;
        this.y2 = null;
        this.y3 = null;
        this.y4 = null;
        this.y5 = null;
        this.y6 = null;
        this.y7 = null;
        
        this.y7 = y7;
        this.text = null;
        this.text1 = null;
        
        this.text1 = text1;
    }

    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    private String paperSize2;
    private Boolean landscape2;

    public void setTosvg(String paperSize2, Boolean landscape2) {
        this.paperSize = null;
        this.paperSize1 = null;
        this.paperSize2 = null;
        
        this.paperSize2 = paperSize2;
        this.landscape = null;
        this.landscape1 = null;
        this.landscape2 = null;
        
        this.landscape2 = landscape2;
    }

    private Double width12;
    private Double height14;

    public void setTosvg(Double width12, Double height14) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        this.width7 = null;
        this.width8 = null;
        this.width9 = null;
        this.width10 = null;
        this.width11 = null;
        this.width12 = null;
        
        this.width12 = width12;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        this.height5 = null;
        this.height6 = null;
        this.height7 = null;
        this.height8 = null;
        this.height9 = null;
        this.height10 = null;
        this.height11 = null;
        this.height12 = null;
        this.height13 = null;
        this.height14 = null;
        
        this.height14 = height14;
    }

    private Double tx;
    private Double ty;

    public void setTranslate(Double tx, Double ty) {
        this.tx = tx;
        this.ty = ty;
    }

    private String type4;
    private Boolean useCapture2;

    public void setUnlisten(String type4, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        this.type4 = null;
        
        this.type4 = type4;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private Boolean isVisible;

    public void setVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    private String width13;
    private Double width14;

    public void setWidth(String width13) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        this.width7 = null;
        this.width8 = null;
        this.width9 = null;
        this.width10 = null;
        this.width11 = null;
        this.width12 = null;
        this.width13 = null;
        this.width14 = null;
        
        this.width13 = width13;
    }


    public void setWidth(Double width14) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        this.width5 = null;
        this.width6 = null;
        this.width7 = null;
        this.width8 = null;
        this.width9 = null;
        this.width10 = null;
        this.width11 = null;
        this.width12 = null;
        this.width13 = null;
        this.width14 = null;
        
        this.width14 = width14;
    }

    private String generateJSelement() {
        if (element != null) {
            return String.format(Locale.US, "element: %s,", (element != null) ? element.generateJs() : "null");
        }
        return "";
    }

    private String generateJSelement1() {
        if (element1 != null) {
            return String.format(Locale.US, "element: %s,", (element1 != null) ? element1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSm() {
        if (m != null) {
            return String.format(Locale.US, "m: %f,", m);
        }
        return "";
    }

    private String generateJSm1() {
        if (m1 != null) {
            return String.format(Locale.US, "m: %f,", m1);
        }
        return "";
    }

    private String generateJSm2() {
        if (m2 != null) {
            return String.format(Locale.US, "m: %f,", m2);
        }
        return "";
    }

    private String generateJSm3() {
        if (m3 != null) {
            return String.format(Locale.US, "m: %f,", m3);
        }
        return "";
    }

    private String generateJSm4() {
        if (m4 != null) {
            return String.format(Locale.US, "m: %f,", m4);
        }
        return "";
    }

    private String generateJSm5() {
        if (m5 != null) {
            return String.format(Locale.US, "m: %f,", m5);
        }
        return "";
    }

    private String generateJSasyncMode() {
        if (asyncMode != null) {
            return String.format(Locale.US, "asyncMode: %b,", asyncMode);
        }
        return "";
    }

    private String generateJScx() {
        if (cx != null) {
            return String.format(Locale.US, "cx: %f,", cx);
        }
        return "";
    }

    private String generateJScy() {
        if (cy != null) {
            return String.format(Locale.US, "cy: %f,", cy);
        }
        return "";
    }

    private String generateJSradius() {
        if (radius != null) {
            return String.format(Locale.US, "radius: %f,", radius);
        }
        return "";
    }

    private String generateJSclip() {
        if (clip != null) {
            return String.format(Locale.US, "clip: %s,", (clip != null) ? clip.generateJs() : "null");
        }
        return "";
    }

    private String generateJScontainer() {
        if (container != null) {
            return String.format(Locale.US, "container: %s,", (container != null) ? container.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrect() {
        if (rect != null) {
            return String.format(Locale.US, "rect: %s,", Arrays.toString(rect));
        }
        return "";
    }

    private String generateJSrect1() {
        if (rect1 != null) {
            return String.format(Locale.US, "rect: %s,", (rect1 != null) ? rect1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSleft() {
        if (left != null) {
            return String.format(Locale.US, "left: %f,", left);
        }
        return "";
    }

    private String generateJStop() {
        if (top != null) {
            return String.format(Locale.US, "top: %f,", top);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
        }
        return "";
    }

    private String generateJScredits() {
        if (credits != null) {
            return String.format(Locale.US, "credits: %b,", credits);
        }
        return "";
    }

    private String generateJSdesc() {
        if (desc != null) {
            return String.format(Locale.US, "desc: \"%s\",", desc);
        }
        return "";
    }

    private String generateJScx1() {
        if (cx1 != null) {
            return String.format(Locale.US, "cx: %f,", cx1);
        }
        return "";
    }

    private String generateJScy1() {
        if (cy1 != null) {
            return String.format(Locale.US, "cy: %f,", cy1);
        }
        return "";
    }

    private String generateJSrx() {
        if (rx != null) {
            return String.format(Locale.US, "rx: %f,", rx);
        }
        return "";
    }

    private String generateJSry() {
        if (ry != null) {
            return String.format(Locale.US, "ry: %f,", ry);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %f,", width1);
        }
        return "";
    }

    private String generateJSheight1() {
        if (height1 != null) {
            return String.format(Locale.US, "height: %f,", height1);
        }
        return "";
    }

    private String generateJSquality() {
        if (quality != null) {
            return String.format(Locale.US, "quality: %f,", quality);
        }
        return "";
    }

    private String generateJSforceTransparentWhite() {
        if (forceTransparentWhite != null) {
            return String.format(Locale.US, "forceTransparentWhite: %b,", forceTransparentWhite);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth() {
        if (paperSizeOrWidth != null) {
            return String.format(Locale.US, "paperSizeOrWidth: %f,", paperSizeOrWidth);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth1() {
        if (paperSizeOrWidth1 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: \"%s\",", paperSizeOrWidth1);
        }
        return "";
    }

    private String generateJSlandscapeOrWidth() {
        if (landscapeOrWidth != null) {
            return String.format(Locale.US, "landscapeOrWidth: %f,", landscapeOrWidth);
        }
        return "";
    }

    private String generateJSlandscapeOrWidth1() {
        if (landscapeOrWidth1 != null) {
            return String.format(Locale.US, "landscapeOrWidth: %b,", landscapeOrWidth1);
        }
        return "";
    }

    private String generateJSx() {
        if (x != null) {
            return String.format(Locale.US, "x: %f,", x);
        }
        return "";
    }

    private String generateJSy() {
        if (y != null) {
            return String.format(Locale.US, "y: %f,", y);
        }
        return "";
    }

    private String generateJSwidth2() {
        if (width2 != null) {
            return String.format(Locale.US, "width: %f,", width2);
        }
        return "";
    }

    private String generateJSheight2() {
        if (height2 != null) {
            return String.format(Locale.US, "height: %f,", height2);
        }
        return "";
    }

    private String generateJSquality1() {
        if (quality1 != null) {
            return String.format(Locale.US, "quality: %f,", quality1);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth2() {
        if (paperSizeOrWidth2 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: \"%s\",", paperSizeOrWidth2);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth3() {
        if (paperSizeOrWidth3 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: %f,", paperSizeOrWidth3);
        }
        return "";
    }

    private String generateJSlandscapeOrHeight() {
        if (landscapeOrHeight != null) {
            return String.format(Locale.US, "landscapeOrHeight: %b,", landscapeOrHeight);
        }
        return "";
    }

    private String generateJSlandscapeOrHeight1() {
        if (landscapeOrHeight1 != null) {
            return String.format(Locale.US, "landscapeOrHeight: \"%s\",", landscapeOrHeight1);
        }
        return "";
    }

    private String generateJSelement2() {
        if (element2 != null) {
            return String.format(Locale.US, "element: %s,", (element2 != null) ? element2.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", (type != null) ? type.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: \"%s\",", color);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSsize() {
        if (size != null) {
            return String.format(Locale.US, "size: %f,", size);
        }
        return "";
    }

    private String generateJSheight3() {
        if (height3 != null) {
            return String.format(Locale.US, "height: \"%s\",", height3);
        }
        return "";
    }

    private String generateJSheight4() {
        if (height4 != null) {
            return String.format(Locale.US, "height: %f,", height4);
        }
        return "";
    }

    private String generateJSx1() {
        if (x1 != null) {
            return String.format(Locale.US, "x: %f,", x1);
        }
        return "";
    }

    private String generateJSy1() {
        if (y1 != null) {
            return String.format(Locale.US, "y: %f,", y1);
        }
        return "";
    }

    private String generateJStext() {
        if (text != null) {
            return String.format(Locale.US, "text: \"%s\",", text);
        }
        return "";
    }

    private String generateJSid() {
        if (id != null) {
            return String.format(Locale.US, "id: \"%s\",", id);
        }
        return "";
    }

    private String generateJSsrc() {
        if (src != null) {
            return String.format(Locale.US, "src: \"%s\",", src);
        }
        return "";
    }

    private String generateJSx2() {
        if (x2 != null) {
            return String.format(Locale.US, "x: %f,", x2);
        }
        return "";
    }

    private String generateJSy2() {
        if (y2 != null) {
            return String.format(Locale.US, "y: %f,", y2);
        }
        return "";
    }

    private String generateJSwidth3() {
        if (width3 != null) {
            return String.format(Locale.US, "width: %f,", width3);
        }
        return "";
    }

    private String generateJSheight5() {
        if (height5 != null) {
            return String.format(Locale.US, "height: %f,", height5);
        }
        return "";
    }

    private String generateJSelement3() {
        if (element3 != null) {
            return String.format(Locale.US, "element: %s,", (element3 != null) ? element3.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: \"%s\",", type1);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: \"%s\",", type2);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSmaxResizeDelay() {
        if (maxResizeDelay != null) {
            return String.format(Locale.US, "maxResizeDelay: %f,", maxResizeDelay);
        }
        return "";
    }

    private String generateJSbounds() {
        if (bounds != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds != null) ? bounds.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth4() {
        if (paperSizeOrWidth4 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: \"%s\",", paperSizeOrWidth4);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth5() {
        if (paperSizeOrWidth5 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: %f,", paperSizeOrWidth5);
        }
        return "";
    }

    private String generateJSlandscapeOrHeight2() {
        if (landscapeOrHeight2 != null) {
            return String.format(Locale.US, "landscapeOrHeight: %b,", landscapeOrHeight2);
        }
        return "";
    }

    private String generateJSlandscapeOrHeight3() {
        if (landscapeOrHeight3 != null) {
            return String.format(Locale.US, "landscapeOrHeight: \"%s\",", landscapeOrHeight3);
        }
        return "";
    }

    private String generateJSx3() {
        if (x3 != null) {
            return String.format(Locale.US, "x: %f,", x3);
        }
        return "";
    }

    private String generateJSy3() {
        if (y3 != null) {
            return String.format(Locale.US, "y: %f,", y3);
        }
        return "";
    }

    private String generateJSwidth4() {
        if (width4 != null) {
            return String.format(Locale.US, "width: %f,", width4);
        }
        return "";
    }

    private String generateJSheight6() {
        if (height6 != null) {
            return String.format(Locale.US, "height: %f,", height6);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: \"%s\",", type3);
        }
        return "";
    }

    private String generateJSelement4() {
        if (element4 != null) {
            return String.format(Locale.US, "element: %s,", (element4 != null) ? element4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }

    private String generateJSwidth5() {
        if (width5 != null) {
            return String.format(Locale.US, "width: %f,", width5);
        }
        return "";
    }

    private String generateJSwidth6() {
        if (width6 != null) {
            return String.format(Locale.US, "width: \"%s\",", width6);
        }
        return "";
    }

    private String generateJSheight7() {
        if (height7 != null) {
            return String.format(Locale.US, "height: %f,", height7);
        }
        return "";
    }

    private String generateJSheight8() {
        if (height8 != null) {
            return String.format(Locale.US, "height: \"%s\",", height8);
        }
        return "";
    }

    private String generateJSforce() {
        if (force != null) {
            return String.format(Locale.US, "force: %b,", force);
        }
        return "";
    }

    private String generateJSdegrees() {
        if (degrees != null) {
            return String.format(Locale.US, "degrees: %f,", degrees);
        }
        return "";
    }

    private String generateJScx2() {
        if (cx2 != null) {
            return String.format(Locale.US, "cx: %f,", cx2);
        }
        return "";
    }

    private String generateJScy2() {
        if (cy2 != null) {
            return String.format(Locale.US, "cy: %f,", cy2);
        }
        return "";
    }

    private String generateJSdegrees1() {
        if (degrees1 != null) {
            return String.format(Locale.US, "degrees: %f,", degrees1);
        }
        return "";
    }

    private String generateJSanchor() {
        if (anchor != null) {
            return String.format(Locale.US, "anchor: %s,", (anchor != null) ? anchor.generateJs() : "null");
        }
        return "";
    }

    private String generateJSanchor1() {
        if (anchor1 != null) {
            return String.format(Locale.US, "anchor: \"%s\",", anchor1);
        }
        return "";
    }

    private String generateJSwidth7() {
        if (width7 != null) {
            return String.format(Locale.US, "width: %f,", width7);
        }
        return "";
    }

    private String generateJSheight9() {
        if (height9 != null) {
            return String.format(Locale.US, "height: %f,", height9);
        }
        return "";
    }

    private String generateJSquality2() {
        if (quality2 != null) {
            return String.format(Locale.US, "quality: %f,", quality2);
        }
        return "";
    }

    private String generateJSforceTransparentWhite1() {
        if (forceTransparentWhite1 != null) {
            return String.format(Locale.US, "forceTransparentWhite: %b,", forceTransparentWhite1);
        }
        return "";
    }

    private String generateJSfilename() {
        if (filename != null) {
            return String.format(Locale.US, "filename: \"%s\",", filename);
        }
        return "";
    }

    private String generateJSpaperSize() {
        if (paperSize != null) {
            return String.format(Locale.US, "paperSize: \"%s\",", paperSize);
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
        }
        return "";
    }

    private String generateJSx4() {
        if (x4 != null) {
            return String.format(Locale.US, "x: %f,", x4);
        }
        return "";
    }

    private String generateJSy4() {
        if (y4 != null) {
            return String.format(Locale.US, "y: %f,", y4);
        }
        return "";
    }

    private String generateJSfilename1() {
        if (filename1 != null) {
            return String.format(Locale.US, "filename: \"%s\",", filename1);
        }
        return "";
    }

    private String generateJSwidth8() {
        if (width8 != null) {
            return String.format(Locale.US, "width: %f,", width8);
        }
        return "";
    }

    private String generateJSheight10() {
        if (height10 != null) {
            return String.format(Locale.US, "height: %f,", height10);
        }
        return "";
    }

    private String generateJSquality3() {
        if (quality3 != null) {
            return String.format(Locale.US, "quality: %f,", quality3);
        }
        return "";
    }

    private String generateJSfilename2() {
        if (filename2 != null) {
            return String.format(Locale.US, "filename: \"%s\",", filename2);
        }
        return "";
    }

    private String generateJSpaperSize1() {
        if (paperSize1 != null) {
            return String.format(Locale.US, "paperSize: \"%s\",", paperSize1);
        }
        return "";
    }

    private String generateJSlandscape1() {
        if (landscape1 != null) {
            return String.format(Locale.US, "landscape: %b,", landscape1);
        }
        return "";
    }

    private String generateJSfilename3() {
        if (filename3 != null) {
            return String.format(Locale.US, "filename: \"%s\",", filename3);
        }
        return "";
    }

    private String generateJSwidth9() {
        if (width9 != null) {
            return String.format(Locale.US, "width: %f,", width9);
        }
        return "";
    }

    private String generateJSheight11() {
        if (height11 != null) {
            return String.format(Locale.US, "height: %f,", height11);
        }
        return "";
    }

    private String generateJSsx() {
        if (sx != null) {
            return String.format(Locale.US, "sx: %f,", sx);
        }
        return "";
    }

    private String generateJSsy() {
        if (sy != null) {
            return String.format(Locale.US, "sy: %f,", sy);
        }
        return "";
    }

    private String generateJScx3() {
        if (cx3 != null) {
            return String.format(Locale.US, "cx: %f,", cx3);
        }
        return "";
    }

    private String generateJScy3() {
        if (cy3 != null) {
            return String.format(Locale.US, "cy: %f,", cy3);
        }
        return "";
    }

    private String generateJSsx1() {
        if (sx1 != null) {
            return String.format(Locale.US, "sx: %f,", sx1);
        }
        return "";
    }

    private String generateJSsy1() {
        if (sy1 != null) {
            return String.format(Locale.US, "sy: %f,", sy1);
        }
        return "";
    }

    private String generateJSanchor2() {
        if (anchor2 != null) {
            return String.format(Locale.US, "anchor: %s,", (anchor2 != null) ? anchor2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSanchor3() {
        if (anchor3 != null) {
            return String.format(Locale.US, "anchor: \"%s\",", anchor3);
        }
        return "";
    }

    private String generateJSx5() {
        if (x5 != null) {
            return String.format(Locale.US, "x: %f,", x5);
        }
        return "";
    }

    private String generateJSy5() {
        if (y5 != null) {
            return String.format(Locale.US, "y: %f,", y5);
        }
        return "";
    }

    private String generateJSdegrees2() {
        if (degrees2 != null) {
            return String.format(Locale.US, "degrees: %f,", degrees2);
        }
        return "";
    }

    private String generateJScx4() {
        if (cx4 != null) {
            return String.format(Locale.US, "cx: %f,", cx4);
        }
        return "";
    }

    private String generateJScy4() {
        if (cy4 != null) {
            return String.format(Locale.US, "cy: %f,", cy4);
        }
        return "";
    }

    private String generateJSdegrees3() {
        if (degrees3 != null) {
            return String.format(Locale.US, "degrees: %f,", degrees3);
        }
        return "";
    }

    private String generateJSanchor4() {
        if (anchor4 != null) {
            return String.format(Locale.US, "anchor: %s,", (anchor4 != null) ? anchor4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSanchor5() {
        if (anchor5 != null) {
            return String.format(Locale.US, "anchor: \"%s\",", anchor5);
        }
        return "";
    }

    private String generateJSm6() {
        if (m6 != null) {
            return String.format(Locale.US, "m: %f,", m6);
        }
        return "";
    }

    private String generateJSm7() {
        if (m7 != null) {
            return String.format(Locale.US, "m: %f,", m7);
        }
        return "";
    }

    private String generateJSm8() {
        if (m8 != null) {
            return String.format(Locale.US, "m: %f,", m8);
        }
        return "";
    }

    private String generateJSm9() {
        if (m9 != null) {
            return String.format(Locale.US, "m: %f,", m9);
        }
        return "";
    }

    private String generateJSm10() {
        if (m10 != null) {
            return String.format(Locale.US, "m: %f,", m10);
        }
        return "";
    }

    private String generateJSm11() {
        if (m11 != null) {
            return String.format(Locale.US, "m: %f,", m11);
        }
        return "";
    }

    private String generateJSasBase() {
        if (asBase != null) {
            return String.format(Locale.US, "asBase: %b,", asBase);
        }
        return "";
    }

    private String generateJSwidth10() {
        if (width10 != null) {
            return String.format(Locale.US, "width: %f,", width10);
        }
        return "";
    }

    private String generateJSheight12() {
        if (height12 != null) {
            return String.format(Locale.US, "height: %f,", height12);
        }
        return "";
    }

    private String generateJSquality4() {
        if (quality4 != null) {
            return String.format(Locale.US, "quality: %f,", quality4);
        }
        return "";
    }

    private String generateJSforceTransparentWhite2() {
        if (forceTransparentWhite2 != null) {
            return String.format(Locale.US, "forceTransparentWhite: %b,", forceTransparentWhite2);
        }
        return "";
    }

    private String generateJSfilename4() {
        if (filename4 != null) {
            return String.format(Locale.US, "filename: \"%s\",", filename4);
        }
        return "";
    }

    private String generateJSasBase1() {
        if (asBase1 != null) {
            return String.format(Locale.US, "asBase: %b,", asBase1);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth6() {
        if (paperSizeOrWidth6 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: %f,", paperSizeOrWidth6);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth7() {
        if (paperSizeOrWidth7 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: \"%s\",", paperSizeOrWidth7);
        }
        return "";
    }

    private String generateJSlandscapeOrWidth2() {
        if (landscapeOrWidth2 != null) {
            return String.format(Locale.US, "landscapeOrWidth: %f,", landscapeOrWidth2);
        }
        return "";
    }

    private String generateJSlandscapeOrWidth3() {
        if (landscapeOrWidth3 != null) {
            return String.format(Locale.US, "landscapeOrWidth: %b,", landscapeOrWidth3);
        }
        return "";
    }

    private String generateJSx6() {
        if (x6 != null) {
            return String.format(Locale.US, "x: %f,", x6);
        }
        return "";
    }

    private String generateJSy6() {
        if (y6 != null) {
            return String.format(Locale.US, "y: %f,", y6);
        }
        return "";
    }

    private String generateJSfilename5() {
        if (filename5 != null) {
            return String.format(Locale.US, "filename: \"%s\",", filename5);
        }
        return "";
    }

    private String generateJSasBase2() {
        if (asBase2 != null) {
            return String.format(Locale.US, "asBase: %b,", asBase2);
        }
        return "";
    }

    private String generateJSwidth11() {
        if (width11 != null) {
            return String.format(Locale.US, "width: %f,", width11);
        }
        return "";
    }

    private String generateJSheight13() {
        if (height13 != null) {
            return String.format(Locale.US, "height: %f,", height13);
        }
        return "";
    }

    private String generateJSquality5() {
        if (quality5 != null) {
            return String.format(Locale.US, "quality: %f,", quality5);
        }
        return "";
    }

    private String generateJSfilename6() {
        if (filename6 != null) {
            return String.format(Locale.US, "filename: \"%s\",", filename6);
        }
        return "";
    }

    private String generateJSasBase3() {
        if (asBase3 != null) {
            return String.format(Locale.US, "asBase: %b,", asBase3);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth8() {
        if (paperSizeOrWidth8 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: \"%s\",", paperSizeOrWidth8);
        }
        return "";
    }

    private String generateJSpaperSizeOrWidth9() {
        if (paperSizeOrWidth9 != null) {
            return String.format(Locale.US, "paperSizeOrWidth: %f,", paperSizeOrWidth9);
        }
        return "";
    }

    private String generateJSlandscapeOrHeight4() {
        if (landscapeOrHeight4 != null) {
            return String.format(Locale.US, "landscapeOrHeight: %b,", landscapeOrHeight4);
        }
        return "";
    }

    private String generateJSlandscapeOrHeight5() {
        if (landscapeOrHeight5 != null) {
            return String.format(Locale.US, "landscapeOrHeight: \"%s\",", landscapeOrHeight5);
        }
        return "";
    }

    private String generateJSfilename7() {
        if (filename7 != null) {
            return String.format(Locale.US, "filename: \"%s\",", filename7);
        }
        return "";
    }

    private String generateJSelement5() {
        if (element5 != null) {
            return String.format(Locale.US, "element: %s,", (element5 != null) ? element5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSelement6() {
        if (element6 != null) {
            return String.format(Locale.US, "element: %s,", (element6 != null) ? element6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex3() {
        if (index3 != null) {
            return String.format(Locale.US, "index: %f,", index3);
        }
        return "";
    }

    private String generateJSindex4() {
        if (index4 != null) {
            return String.format(Locale.US, "index: %f,", index4);
        }
        return "";
    }

    private String generateJSx7() {
        if (x7 != null) {
            return String.format(Locale.US, "x: %f,", x7);
        }
        return "";
    }

    private String generateJSy7() {
        if (y7 != null) {
            return String.format(Locale.US, "y: %f,", y7);
        }
        return "";
    }

    private String generateJStext1() {
        if (text1 != null) {
            return String.format(Locale.US, "text: \"%s\",", text1);
        }
        return "";
    }

    private String generateJStitle() {
        if (title != null) {
            return String.format(Locale.US, "title: \"%s\",", title);
        }
        return "";
    }

    private String generateJSpaperSize2() {
        if (paperSize2 != null) {
            return String.format(Locale.US, "paperSize: \"%s\",", paperSize2);
        }
        return "";
    }

    private String generateJSlandscape2() {
        if (landscape2 != null) {
            return String.format(Locale.US, "landscape: %b,", landscape2);
        }
        return "";
    }

    private String generateJSwidth12() {
        if (width12 != null) {
            return String.format(Locale.US, "width: %f,", width12);
        }
        return "";
    }

    private String generateJSheight14() {
        if (height14 != null) {
            return String.format(Locale.US, "height: %f,", height14);
        }
        return "";
    }

    private String generateJStx() {
        if (tx != null) {
            return String.format(Locale.US, "tx: %f,", tx);
        }
        return "";
    }

    private String generateJSty() {
        if (ty != null) {
            return String.format(Locale.US, "ty: %f,", ty);
        }
        return "";
    }

    private String generateJStype4() {
        if (type4 != null) {
            return String.format(Locale.US, "type: \"%s\",", type4);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSisVisible() {
        if (isVisible != null) {
            return String.format(Locale.US, "isVisible: %b,", isVisible);
        }
        return "";
    }

    private String generateJSwidth13() {
        if (width13 != null) {
            return String.format(Locale.US, "width: \"%s\",", width13);
        }
        return "";
    }

    private String generateJSwidth14() {
        if (width14 != null) {
            return String.format(Locale.US, "width: %f,", width14);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSelement());
        js.append(generateJSelement1());
        js.append(generateJSindex());
        js.append(generateJSm());
        js.append(generateJSm1());
        js.append(generateJSm2());
        js.append(generateJSm3());
        js.append(generateJSm4());
        js.append(generateJSm5());
        js.append(generateJSasyncMode());
        js.append(generateJScx());
        js.append(generateJScy());
        js.append(generateJSradius());
        js.append(generateJSclip());
        js.append(generateJScontainer());
        js.append(generateJSrect());
        js.append(generateJSrect1());
        js.append(generateJSleft());
        js.append(generateJStop());
        js.append(generateJSwidth());
        js.append(generateJSheight());
        js.append(generateJScredits());
        js.append(generateJSdesc());
        js.append(generateJScx1());
        js.append(generateJScy1());
        js.append(generateJSrx());
        js.append(generateJSry());
        js.append(generateJSindex1());
        js.append(generateJSwidth1());
        js.append(generateJSheight1());
        js.append(generateJSquality());
        js.append(generateJSforceTransparentWhite());
        js.append(generateJSpaperSizeOrWidth());
        js.append(generateJSpaperSizeOrWidth1());
        js.append(generateJSlandscapeOrWidth());
        js.append(generateJSlandscapeOrWidth1());
        js.append(generateJSx());
        js.append(generateJSy());
        js.append(generateJSwidth2());
        js.append(generateJSheight2());
        js.append(generateJSquality1());
        js.append(generateJSpaperSizeOrWidth2());
        js.append(generateJSpaperSizeOrWidth3());
        js.append(generateJSlandscapeOrHeight());
        js.append(generateJSlandscapeOrHeight1());
        js.append(generateJSelement2());
        js.append(generateJStype());
        js.append(generateJScolor());
        js.append(generateJSthickness());
        js.append(generateJSsize());
        js.append(generateJSheight3());
        js.append(generateJSheight4());
        js.append(generateJSx1());
        js.append(generateJSy1());
        js.append(generateJStext());
        js.append(generateJSid());
        js.append(generateJSsrc());
        js.append(generateJSx2());
        js.append(generateJSy2());
        js.append(generateJSwidth3());
        js.append(generateJSheight5());
        js.append(generateJSelement3());
        js.append(generateJStype1());
        js.append(generateJSuseCapture());
        js.append(generateJStype2());
        js.append(generateJSuseCapture1());
        js.append(generateJSmaxResizeDelay());
        js.append(generateJSbounds());
        js.append(generateJSpaperSizeOrWidth4());
        js.append(generateJSpaperSizeOrWidth5());
        js.append(generateJSlandscapeOrHeight2());
        js.append(generateJSlandscapeOrHeight3());
        js.append(generateJSx3());
        js.append(generateJSy3());
        js.append(generateJSwidth4());
        js.append(generateJSheight6());
        js.append(generateJStype3());
        js.append(generateJSelement4());
        js.append(generateJSindex2());
        js.append(generateJSwidth5());
        js.append(generateJSwidth6());
        js.append(generateJSheight7());
        js.append(generateJSheight8());
        js.append(generateJSforce());
        js.append(generateJSdegrees());
        js.append(generateJScx2());
        js.append(generateJScy2());
        js.append(generateJSdegrees1());
        js.append(generateJSanchor());
        js.append(generateJSanchor1());
        js.append(generateJSwidth7());
        js.append(generateJSheight9());
        js.append(generateJSquality2());
        js.append(generateJSforceTransparentWhite1());
        js.append(generateJSfilename());
        js.append(generateJSpaperSize());
        js.append(generateJSlandscape());
        js.append(generateJSx4());
        js.append(generateJSy4());
        js.append(generateJSfilename1());
        js.append(generateJSwidth8());
        js.append(generateJSheight10());
        js.append(generateJSquality3());
        js.append(generateJSfilename2());
        js.append(generateJSpaperSize1());
        js.append(generateJSlandscape1());
        js.append(generateJSfilename3());
        js.append(generateJSwidth9());
        js.append(generateJSheight11());
        js.append(generateJSsx());
        js.append(generateJSsy());
        js.append(generateJScx3());
        js.append(generateJScy3());
        js.append(generateJSsx1());
        js.append(generateJSsy1());
        js.append(generateJSanchor2());
        js.append(generateJSanchor3());
        js.append(generateJSx5());
        js.append(generateJSy5());
        js.append(generateJSdegrees2());
        js.append(generateJScx4());
        js.append(generateJScy4());
        js.append(generateJSdegrees3());
        js.append(generateJSanchor4());
        js.append(generateJSanchor5());
        js.append(generateJSm6());
        js.append(generateJSm7());
        js.append(generateJSm8());
        js.append(generateJSm9());
        js.append(generateJSm10());
        js.append(generateJSm11());
        js.append(generateJSasBase());
        js.append(generateJSwidth10());
        js.append(generateJSheight12());
        js.append(generateJSquality4());
        js.append(generateJSforceTransparentWhite2());
        js.append(generateJSfilename4());
        js.append(generateJSasBase1());
        js.append(generateJSpaperSizeOrWidth6());
        js.append(generateJSpaperSizeOrWidth7());
        js.append(generateJSlandscapeOrWidth2());
        js.append(generateJSlandscapeOrWidth3());
        js.append(generateJSx6());
        js.append(generateJSy6());
        js.append(generateJSfilename5());
        js.append(generateJSasBase2());
        js.append(generateJSwidth11());
        js.append(generateJSheight13());
        js.append(generateJSquality5());
        js.append(generateJSfilename6());
        js.append(generateJSasBase3());
        js.append(generateJSpaperSizeOrWidth8());
        js.append(generateJSpaperSizeOrWidth9());
        js.append(generateJSlandscapeOrHeight4());
        js.append(generateJSlandscapeOrHeight5());
        js.append(generateJSfilename7());
        js.append(generateJSelement5());
        js.append(generateJSelement6());
        js.append(generateJSindex3());
        js.append(generateJSindex4());
        js.append(generateJSx7());
        js.append(generateJSy7());
        js.append(generateJStext1());
        js.append(generateJStitle());
        js.append(generateJSpaperSize2());
        js.append(generateJSlandscape2());
        js.append(generateJSwidth12());
        js.append(generateJSheight14());
        js.append(generateJStx());
        js.append(generateJSty());
        js.append(generateJStype4());
        js.append(generateJSuseCapture2());
        js.append(generateJSisVisible());
        js.append(generateJSwidth13());
        js.append(generateJSwidth14());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}