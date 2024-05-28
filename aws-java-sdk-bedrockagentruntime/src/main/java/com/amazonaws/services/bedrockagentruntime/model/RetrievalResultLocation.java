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
 * Contains information about the location of the data source.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Retrieve.html#API_agent-runtime_Retrieve_ResponseSyntax"
 * >Retrieve response</a> – in the <code>location</code> field
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html#API_agent-runtime_RetrieveAndGenerate_ResponseSyntax"
 * >RetrieveAndGenerate response</a> – in the <code>location</code> field
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html#API_agent-runtime_InvokeAgent_ResponseSyntax"
 * >InvokeAgent response</a> – in the <code>locatino</code> field
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/RetrievalResultLocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrievalResultLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the S3 location of the data source.
     * </p>
     */
    private RetrievalResultS3Location s3Location;
    /**
     * <p>
     * The type of the location of the data source.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Contains the S3 location of the data source.
     * </p>
     * 
     * @param s3Location
     *        Contains the S3 location of the data source.
     */

    public void setS3Location(RetrievalResultS3Location s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * Contains the S3 location of the data source.
     * </p>
     * 
     * @return Contains the S3 location of the data source.
     */

    public RetrievalResultS3Location getS3Location() {
        return this.s3Location;
    }

    /**
     * <p>
     * Contains the S3 location of the data source.
     * </p>
     * 
     * @param s3Location
     *        Contains the S3 location of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrievalResultLocation withS3Location(RetrievalResultS3Location s3Location) {
        setS3Location(s3Location);
        return this;
    }

    /**
     * <p>
     * The type of the location of the data source.
     * </p>
     * 
     * @param type
     *        The type of the location of the data source.
     * @see RetrievalResultLocationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the location of the data source.
     * </p>
     * 
     * @return The type of the location of the data source.
     * @see RetrievalResultLocationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the location of the data source.
     * </p>
     * 
     * @param type
     *        The type of the location of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrievalResultLocationType
     */

    public RetrievalResultLocation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the location of the data source.
     * </p>
     * 
     * @param type
     *        The type of the location of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrievalResultLocationType
     */

    public RetrievalResultLocation withType(RetrievalResultLocationType type) {
        this.type = type.toString();
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
        if (getS3Location() != null)
            sb.append("S3Location: ").append(getS3Location()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrievalResultLocation == false)
            return false;
        RetrievalResultLocation other = (RetrievalResultLocation) obj;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RetrievalResultLocation clone() {
        try {
            return (RetrievalResultLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.RetrievalResultLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
