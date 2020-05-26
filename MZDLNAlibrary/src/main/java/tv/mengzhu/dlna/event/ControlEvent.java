package tv.mengzhu.dlna.event;


import tv.mengzhu.dlna.entity.AVTransportInfo;
import tv.mengzhu.dlna.entity.RenderingControlInfo;

/**
 * Created by lzan13 on 2018/4/12.
 * 投屏控制相关事件类
 */
public class ControlEvent {
    private AVTransportInfo avtInfo;
    private RenderingControlInfo rcInfo;

    public AVTransportInfo getAvtInfo() {
        return avtInfo;
    }

    public void setAvtInfo(AVTransportInfo avtInfo) {
        this.avtInfo = avtInfo;
    }

    public RenderingControlInfo getRcInfo() {
        return rcInfo;
    }

    public void setRcInfo(RenderingControlInfo rcInfo) {
        this.rcInfo = rcInfo;
    }
}