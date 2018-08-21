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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSDataAsset/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSDataAssetPtr extends Ptr<NSDataAsset, NSDataAssetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSDataAsset.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSDataAsset() {}
    protected NSDataAsset(Handle h, long handle) { super(h, handle); }
    protected NSDataAsset(SkipInit skipInit) { super(skipInit); }
    protected long ptr;

    @Method(selector = "initWithName:")
    public NSDataAsset(String name) throws FileNotFoundException {
        super((SkipInit) null);
        ptr = init(name);
        if(ptr == 0) {
            throw new FileNotFoundException("Asset with identifier '" + name + "' not found");
        } else {
            initObject(ptr);
        }
    }

    @Method(selector = "initWithName:bundle:")
    public NSDataAsset(String name, NSBundle bundle) throws FileNotFoundException {
        super((SkipInit) null);
        ptr = init(name, bundle);
        if(ptr == 0) {
            throw new FileNotFoundException("Asset with identifier '" + name + "' not found");
        } else {
            initObject(ptr);
        }

    }

    @Override
    protected void doDispose() {
        if(ptr != 0)
            super.doDispose();
    }

    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "typeIdentifier")
    public native String getTypeIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:")
    protected native @Pointer long init(String name);
    @Method(selector = "initWithName:bundle:")
    protected native @Pointer long init(String name, NSBundle bundle);
    /*</methods>*/
}
