/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.protocol;

import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.util.TimestampFormat;

/**
 * Metadata about the marshalling requirements of a given member. Includes things like where to put the
 * data (payload, query, etc), the location name it's bound to (JSON field name, query param name, etc)
 * and additional directives about how to transform it (i.e. is it binary data, should it be auto generated, etc).
 */
@SdkProtectedApi
public class MarshallingInfo<T> {

    private final MarshallingType<T> marshallingType;
    private final String marshallLocationName;
    private final MarshallLocation marshallLocation;
    private final boolean isExplicitPayloadMember;
    private final boolean isBinary;
    private final DefaultValueSupplier<T> defaultValueSupplier;
    private final TimestampFormat timestampFormat;

    private MarshallingInfo(Builder<T> builder) {
        this.marshallingType = builder.marshallingType;
        this.marshallLocationName = builder.marshallLocationName;
        this.marshallLocation = builder.marshallLocation;
        this.isExplicitPayloadMember = builder.isExplicitPayloadMember;
        this.isBinary = builder.isBinary;
        this.defaultValueSupplier = builder.defaultValueSupplier;
        this.timestampFormat = TimestampFormat.fromValue(builder.timestampFormat);
    }

    /**
     * @return MarshallingType for this member.
     */
    public MarshallingType<T> marshallingType() {
        return marshallingType;
    }

    /**
     * @return Marshall location name. This may represent different things depending on where the data is meant to be marshalled
     * to. For data bound to the payload, this may be the JSON field name, for data bound to the query params this will be the
     * parameter name, for data bound to the path this will be the value of the path placeholder to replace in the request URI.
     * Note that it may be null for explicit payload members.
     */
    public String marshallLocationName() {
        return marshallLocationName;
    }

    /**
     * @return Where the data should be marshalled to.
     */
    public MarshallLocation marshallLocation() {
        return marshallLocation;
    }

    /**
     * @return True if the member is explicitly bound to the payload. Applicable only for RESTFUL services.
     */
    public boolean isExplicitPayloadMember() {
        return isExplicitPayloadMember;
    }

    /**
     * @return True if the payload member is binary data (i.e. a {@link java.nio.ByteBuffer} or {@link java.io.InputStream} and
     * should be sent as the request content. This is not true when binary data is bound to a member of the JSON payload since it
     * will be base64 encoded as a string.
     */
    public boolean isBinary() {
        return isBinary;
    }

    /**
     * @return Optional supplier of default value if the value to marshall is null.
     */
    public DefaultValueSupplier<T> defaultValueSupplier() {
        return defaultValueSupplier;
    }

    /**
     * @return Optional timestampFormat if the value type is date
     */
    public TimestampFormat timestampFormat() {
        return timestampFormat;
    }

    /**
     * @return Builder instance to construct a {@link MarshallingInfo}.
     */
    public static <T> Builder<T> builder(MarshallingType<T> marshallingType) {
        return new Builder<T>(marshallingType);
    }

    /**
     * Builder for a {@link MarshallingInfo}.
     */
    public static final class Builder<T> {

        private final MarshallingType<T> marshallingType;
        private String marshallLocationName;
        private MarshallLocation marshallLocation;
        private boolean isExplicitPayloadMember;
        private boolean isBinary;
        private DefaultValueSupplier<T> defaultValueSupplier;
        private String timestampFormat;

        private Builder(MarshallingType<T> marshallingType) {
            this.marshallingType = marshallingType;
        }

        public Builder<T> marshallLocationName(String marshallLocationName) {
            this.marshallLocationName = marshallLocationName;
            return this;
        }

        public Builder<T> marshallLocation(MarshallLocation marshallLocation) {
            this.marshallLocation = marshallLocation;
            return this;
        }

        public Builder<T> isExplicitPayloadMember(boolean isExplicitPayloadMember) {
            this.isExplicitPayloadMember = isExplicitPayloadMember;
            return this;
        }

        public Builder<T> isBinary(boolean isBinary) {
            this.isBinary = isBinary;
            return this;
        }

        public Builder<T> defaultValueSupplier(DefaultValueSupplier<T> defaultValueSupplier) {
            this.defaultValueSupplier = defaultValueSupplier;
            return this;
        }

        public Builder<T> timestampFormat(String timestampFormat) {
            this.timestampFormat = timestampFormat;
            return this;
        }

        /**
         * @return An immutable {@link MarshallingInfo} object.
         */
        public MarshallingInfo<T> build() {
            return new MarshallingInfo<T>(this);
        }
    }

}
