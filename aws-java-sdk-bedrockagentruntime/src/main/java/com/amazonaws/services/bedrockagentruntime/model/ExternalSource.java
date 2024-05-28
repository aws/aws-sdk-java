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
 * The unique external source of the content contained in the wrapper object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/ExternalSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExternalSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier, contentType, and data of the external source wrapper object.
     * </p>
     */
    private ByteContentDoc byteContent;
    /**
     * <p>
     * The S3 location of the external source wrapper object.
     * </p>
     */
    private S3ObjectDoc s3Location;
    /**
     * <p>
     * The source type of the external source wrapper object.
     * </p>
     */
    private String sourceType;

    /**
     * <p>
     * The identifier, contentType, and data of the external source wrapper object.
     * </p>
     * 
     * @param byteContent
     *        The identifier, contentType, and data of the external source wrapper object.
     */

    public void setByteContent(ByteContentDoc byteContent) {
        this.byteContent = byteContent;
    }

    /**
     * <p>
     * The identifier, contentType, and data of the external source wrapper object.
     * </p>
     * 
     * @return The identifier, contentType, and data of the external source wrapper object.
     */

    public ByteContentDoc getByteContent() {
        return this.byteContent;
    }

    /**
     * <p>
     * The identifier, contentType, and data of the external source wrapper object.
     * </p>
     * 
     * @param byteContent
     *        The identifier, contentType, and data of the external source wrapper object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalSource withByteContent(ByteContentDoc byteContent) {
        setByteContent(byteContent);
        return this;
    }

    /**
     * <p>
     * The S3 location of the external source wrapper object.
     * </p>
     * 
     * @param s3Location
     *        The S3 location of the external source wrapper object.
     */

    public void setS3Location(S3ObjectDoc s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * The S3 location of the external source wrapper object.
     * </p>
     * 
     * @return The S3 location of the external source wrapper object.
     */

    public S3ObjectDoc getS3Location() {
        return this.s3Location;
    }

    /**
     * <p>
     * The S3 location of the external source wrapper object.
     * </p>
     * 
     * @param s3Location
     *        The S3 location of the external source wrapper object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalSource withS3Location(S3ObjectDoc s3Location) {
        setS3Location(s3Location);
        return this;
    }

    /**
     * <p>
     * The source type of the external source wrapper object.
     * </p>
     * 
     * @param sourceType
     *        The source type of the external source wrapper object.
     * @see ExternalSourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type of the external source wrapper object.
     * </p>
     * 
     * @return The source type of the external source wrapper object.
     * @see ExternalSourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source type of the external source wrapper object.
     * </p>
     * 
     * @param sourceType
     *        The source type of the external source wrapper object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalSourceType
     */

    public ExternalSource withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The source type of the external source wrapper object.
     * </p>
     * 
     * @param sourceType
     *        The source type of the external source wrapper object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalSourceType
     */

    public ExternalSource withSourceType(ExternalSourceType sourceType) {
        this.sourceType = sourceType.toString();
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
        if (getByteContent() != null)
            sb.append("ByteContent: ").append(getByteContent()).append(",");
        if (getS3Location() != null)
            sb.append("S3Location: ").append(getS3Location()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExternalSource == false)
            return false;
        ExternalSource other = (ExternalSource) obj;
        if (other.getByteContent() == null ^ this.getByteContent() == null)
            return false;
        if (other.getByteContent() != null && other.getByteContent().equals(this.getByteContent()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getByteContent() == null) ? 0 : getByteContent().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        return hashCode;
    }

    @Override
    public ExternalSource clone() {
        try {
            return (ExternalSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.ExternalSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
