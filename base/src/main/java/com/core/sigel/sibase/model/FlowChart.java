package com.core.sigel.sibase.model;

/**
 * @author sigel
 * @version 1.0
 * @date 2018/6/6 13:16
 * @copyRight 四川金信石信息技术有限公司
 * @since 1.0
 */
public class FlowChart {
    private String name;
    private String topName;
    private String bottomName;
    private String time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopName() {
        return topName;
    }

    public void setTopName(String topName) {
        this.topName = topName;
    }

    public String getBottomName() {
        return bottomName;
    }

    public void setBottomName(String bottomName) {
        this.bottomName = bottomName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
