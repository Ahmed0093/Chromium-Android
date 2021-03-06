
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/serial.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class SerialDeviceInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String path;
    public short vendorId;
    public boolean hasVendorId;
    public short productId;
    public boolean hasProductId;
    public String displayName;

    private SerialDeviceInfo(int version) {
        super(STRUCT_SIZE, version);
        this.hasVendorId = (boolean) false;
        this.hasProductId = (boolean) false;
    }

    public SerialDeviceInfo() {
        this(0);
    }

    public static SerialDeviceInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SerialDeviceInfo deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SerialDeviceInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SerialDeviceInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new SerialDeviceInfo(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.path = decoder0.readString(8, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.vendorId = decoder0.readShort(16);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.hasVendorId = decoder0.readBoolean(18, 0);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.hasProductId = decoder0.readBoolean(18, 1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.productId = decoder0.readShort(20);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.displayName = decoder0.readString(24, true);
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.path, 8, false);
        
        encoder0.encode(this.vendorId, 16);
        
        encoder0.encode(this.hasVendorId, 18, 0);
        
        encoder0.encode(this.hasProductId, 18, 1);
        
        encoder0.encode(this.productId, 20);
        
        encoder0.encode(this.displayName, 24, true);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        SerialDeviceInfo other = (SerialDeviceInfo) object;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.path, other.path))
            return false;
        if (this.vendorId!= other.vendorId)
            return false;
        if (this.hasVendorId!= other.hasVendorId)
            return false;
        if (this.productId!= other.productId)
            return false;
        if (this.hasProductId!= other.hasProductId)
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.displayName, other.displayName))
            return false;
        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.path);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.vendorId);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.hasVendorId);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.productId);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.hasProductId);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.displayName);
        return result;
    }
}