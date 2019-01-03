/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A revision for an AWS Lambda deployment that is a YAML-formatted or JSON-formatted string. For AWS Lambda
 * deployments, the revision is the same as the AppSpec file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RawString" target="_top">AWS API
 *      Documentation</a>
 */
@Deprecated
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RawString implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The YAML-formatted or JSON-formatted revision string. It includes information about which Lambda function to
     * update and optional Lambda functions that validate deployment lifecycle events.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The SHA256 hash value of the revision content.
     * </p>
     */
    private String sha256;

    /**
     * <p>
     * The YAML-formatted or JSON-formatted revision string. It includes information about which Lambda function to
     * update and optional Lambda functions that validate deployment lifecycle events.
     * </p>
     * 
     * @param content
     *        The YAML-formatted or JSON-formatted revision string. It includes information about which Lambda function
     *        to update and optional Lambda functions that validate deployment lifecycle events.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The YAML-formatted or JSON-formatted revision string. It includes information about which Lambda function to
     * update and optional Lambda functions that validate deployment lifecycle events.
     * </p>
     * 
     * @return The YAML-formatted or JSON-formatted revision string. It includes information about which Lambda function
     *         to update and optional Lambda functions that validate deployment lifecycle events.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The YAML-formatted or JSON-formatted revision string. It includes information about which Lambda function to
     * update and optional Lambda functions that validate deployment lifecycle events.
     * </p>
     * 
     * @param content
     *        The YAML-formatted or JSON-formatted revision string. It includes information about which Lambda function
     *        to update and optional Lambda functions that validate deployment lifecycle events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RawString withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The SHA256 hash value of the revision content.
     * </p>
     * 
     * @param sha256
     *        The SHA256 hash value of the revision content.
     */

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    /**
     * <p>
     * The SHA256 hash value of the revision content.
     * </p>
     * 
     * @return The SHA256 hash value of the revision content.
     */

    public String getSha256() {
        return this.sha256;
    }

    /**
     * <p>
     * The SHA256 hash value of the revision content.
     * </p>
     * 
     * @param sha256
     *        The SHA256 hash value of the revision content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RawString withSha256(String sha256) {
        setSha256(sha256);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getSha256() != null)
            sb.append("Sha256: ").append(getSha256());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RawString == false)
            return false;
        RawString other = (RawString) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getSha256() == null ^ this.getSha256() == null)
            return false;
        if (other.getSha256() != null && other.getSha256().equals(this.getSha256()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getSha256() == null) ? 0 : getSha256().hashCode());
        return hashCode;
    }

    @Override
    public RawString clone() {
        try {
            return (RawString) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.RawStringMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
