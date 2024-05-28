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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The unique wrapper object of the document from the S3 location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/S3ObjectDoc" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ObjectDoc implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file location of the S3 wrapper object.
     * </p>
     */
    private String uri;

    /**
     * <p>
     * The file location of the S3 wrapper object.
     * </p>
     * 
     * @param uri
     *        The file location of the S3 wrapper object.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The file location of the S3 wrapper object.
     * </p>
     * 
     * @return The file location of the S3 wrapper object.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The file location of the S3 wrapper object.
     * </p>
     * 
     * @param uri
     *        The file location of the S3 wrapper object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectDoc withUri(String uri) {
        setUri(uri);
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
        if (getUri() != null)
            sb.append("Uri: ").append(getUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ObjectDoc == false)
            return false;
        S3ObjectDoc other = (S3ObjectDoc) obj;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        return hashCode;
    }

    @Override
    public S3ObjectDoc clone() {
        try {
            return (S3ObjectDoc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.S3ObjectDocMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
