/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Logging configuration defines where Image Builder uploads your logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/Logging" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Logging implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 logging configuration.
     * </p>
     */
    private S3Logs s3Logs;

    /**
     * <p>
     * The Amazon S3 logging configuration.
     * </p>
     * 
     * @param s3Logs
     *        The Amazon S3 logging configuration.
     */

    public void setS3Logs(S3Logs s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * <p>
     * The Amazon S3 logging configuration.
     * </p>
     * 
     * @return The Amazon S3 logging configuration.
     */

    public S3Logs getS3Logs() {
        return this.s3Logs;
    }

    /**
     * <p>
     * The Amazon S3 logging configuration.
     * </p>
     * 
     * @param s3Logs
     *        The Amazon S3 logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Logging withS3Logs(S3Logs s3Logs) {
        setS3Logs(s3Logs);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getS3Logs() != null)
            sb.append("S3Logs: ").append(getS3Logs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Logging == false)
            return false;
        Logging other = (Logging) obj;
        if (other.getS3Logs() == null ^ this.getS3Logs() == null)
            return false;
        if (other.getS3Logs() != null && other.getS3Logs().equals(this.getS3Logs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Logs() == null) ? 0 : getS3Logs().hashCode());
        return hashCode;
    }

    @Override
    public Logging clone() {
        try {
            return (Logging) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LoggingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
