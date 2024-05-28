/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon S3 location that temporarily stores your data while it processes. Your information won't be saved
 * permanently.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/IntermediateSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntermediateSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location (bucket and prefix). For example: <code>s3://provider_bucket/DOC-EXAMPLE-BUCKET</code>
     * </p>
     */
    private String intermediateS3Path;

    /**
     * <p>
     * The Amazon S3 location (bucket and prefix). For example: <code>s3://provider_bucket/DOC-EXAMPLE-BUCKET</code>
     * </p>
     * 
     * @param intermediateS3Path
     *        The Amazon S3 location (bucket and prefix). For example:
     *        <code>s3://provider_bucket/DOC-EXAMPLE-BUCKET</code>
     */

    public void setIntermediateS3Path(String intermediateS3Path) {
        this.intermediateS3Path = intermediateS3Path;
    }

    /**
     * <p>
     * The Amazon S3 location (bucket and prefix). For example: <code>s3://provider_bucket/DOC-EXAMPLE-BUCKET</code>
     * </p>
     * 
     * @return The Amazon S3 location (bucket and prefix). For example:
     *         <code>s3://provider_bucket/DOC-EXAMPLE-BUCKET</code>
     */

    public String getIntermediateS3Path() {
        return this.intermediateS3Path;
    }

    /**
     * <p>
     * The Amazon S3 location (bucket and prefix). For example: <code>s3://provider_bucket/DOC-EXAMPLE-BUCKET</code>
     * </p>
     * 
     * @param intermediateS3Path
     *        The Amazon S3 location (bucket and prefix). For example:
     *        <code>s3://provider_bucket/DOC-EXAMPLE-BUCKET</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntermediateSourceConfiguration withIntermediateS3Path(String intermediateS3Path) {
        setIntermediateS3Path(intermediateS3Path);
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
        if (getIntermediateS3Path() != null)
            sb.append("IntermediateS3Path: ").append(getIntermediateS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntermediateSourceConfiguration == false)
            return false;
        IntermediateSourceConfiguration other = (IntermediateSourceConfiguration) obj;
        if (other.getIntermediateS3Path() == null ^ this.getIntermediateS3Path() == null)
            return false;
        if (other.getIntermediateS3Path() != null && other.getIntermediateS3Path().equals(this.getIntermediateS3Path()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntermediateS3Path() == null) ? 0 : getIntermediateS3Path().hashCode());
        return hashCode;
    }

    @Override
    public IntermediateSourceConfiguration clone() {
        try {
            return (IntermediateSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.IntermediateSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
