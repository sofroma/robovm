/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 2.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIScreen/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UITraitEnvironment/*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObject observeDidConnect(final VoidBlock1<UIScreen> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidConnectNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UIScreen) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObject observeDidDisconnect(final VoidBlock1<UIScreen> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidDisconnectNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UIScreen) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObject observeModeDidChange(final VoidBlock1<UIScreen> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ModeDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UIScreen) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 5.0 and later.
         */
        public static NSObject observeBrightnessDidChange(final VoidBlock1<UIScreen> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(BrightnessDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UIScreen) a.getObject());
                }
            });
        }
    }
    /*<ptr>*/public static class UIScreenPtr extends Ptr<UIScreen, UIScreenPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIScreen.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIScreen() {}
    protected UIScreen(Handle h, long handle) { super(h, handle); }
    protected UIScreen(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Property(selector = "screens")
    public static native NSArray<UIScreen> getScreens();
    @Property(selector = "mainScreen")
    public static native UIScreen getMainScreen();
    @Property(selector = "bounds")
    public native @ByVal CGRect getBounds();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "scale")
    public native @MachineSizedFloat double getScale();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Property(selector = "availableModes")
    public native NSArray<UIScreenMode> getAvailableModes();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Property(selector = "preferredMode")
    public native UIScreenMode getPreferredMode();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Property(selector = "currentMode")
    public native UIScreenMode getCurrentMode();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Property(selector = "setCurrentMode:")
    public native void setCurrentMode(UIScreenMode v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "overscanCompensation")
    public native UIScreenOverscanCompensation getOverscanCompensation();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "setOverscanCompensation:")
    public native void setOverscanCompensation(UIScreenOverscanCompensation v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "overscanCompensationInsets")
    public native @ByVal UIEdgeInsets getOverscanCompensationInsets();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Property(selector = "mirroredScreen")
    public native UIScreen getMirroredScreen();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isCaptured")
    public native boolean isCaptured();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "brightness")
    public native @MachineSizedFloat double getBrightness();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "setBrightness:")
    public native void setBrightness(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "wantsSoftwareDimming")
    public native boolean wantsSoftwareDimming();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "setWantsSoftwareDimming:")
    public native void setWantsSoftwareDimming(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "coordinateSpace")
    public native UICoordinateSpace getCoordinateSpace();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "fixedCoordinateSpace")
    public native UICoordinateSpace getFixedCoordinateSpace();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "nativeBounds")
    public native @ByVal CGRect getNativeBounds();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "nativeScale")
    public native @MachineSizedFloat double getNativeScale();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "maximumFramesPerSecond")
    public native @MachineSizedSInt long getMaximumFramesPerSecond();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "focusedItem")
    public native UIFocusItem getFocusedItem();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "focusedView")
    public native UIView getFocusedView();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "supportsFocus")
    public native boolean supportsFocus();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use -[UIScreen bounds]
     */
    @Deprecated
    @Property(selector = "applicationFrame")
    public native @ByVal CGRect getApplicationFrame();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "traitCollection")
    public native UITraitCollection getTraitCollection();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalValue(symbol="UIScreenDidConnectNotification", optional=true)
    public static native NSString DidConnectNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalValue(symbol="UIScreenDidDisconnectNotification", optional=true)
    public static native NSString DidDisconnectNotification();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalValue(symbol="UIScreenModeDidChangeNotification", optional=true)
    public static native NSString ModeDidChangeNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalValue(symbol="UIScreenBrightnessDidChangeNotification", optional=true)
    public static native NSString BrightnessDidChangeNotification();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="UIScreenCapturedDidChangeNotification", optional=true)
    public static native NSString CapturedDidChangeNotification();
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @WeaklyLinked
    @Method(selector = "displayLinkWithTarget:selector:")
    public native CADisplayLink getDisplayLink(NSObject target, Selector sel);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "snapshotViewAfterScreenUpdates:")
    public native UIView snapshotView(boolean afterUpdates);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);
    /*</methods>*/
}
