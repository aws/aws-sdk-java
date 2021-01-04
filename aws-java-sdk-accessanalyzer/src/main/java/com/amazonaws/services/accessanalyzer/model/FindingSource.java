/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The source of the finding. This indicates how the access that generated the finding is granted. It is populated for
 * Amazon S3 bucket findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/FindingSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Includes details about how the access that generated the finding is granted. This is populated for Amazon S3
     * bucket findings.
     * </p>
     */
    private FindingSourceDetail detail;
    /**
     * <p>
     * Indicates the type of access that generated the finding.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Includes details about how the access that generated the finding is granted. This is populated for Amazon S3
     * bucket findings.
     * </p>
     * 
     * @param detail
     *        Includes details about how the access that generated the finding is granted. This is populated for Amazon
     *        S3 bucket findings.
     */

    public void setDetail(FindingSourceDetail detail) {
        this.detail = detail;
    }

    /**
     * <p>
     * Includes details about how the access that generated the finding is granted. This is populated for Amazon S3
     * bucket findings.
     * </p>
     * 
     * @return Includes details about how the access that generated the finding is granted. This is populated for Amazon
     *         S3 bucket findings.
     */

    public FindingSourceDetail getDetail() {
        return this.detail;
    }

    /**
     * <p>
     * Includes details about how the access that generated the finding is granted. This is populated for Amazon S3
     * bucket findings.
     * </p>
     * 
     * @param detail
     *        Includes details about how the access that generated the finding is granted. This is populated for Amazon
     *        S3 bucket findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingSource withDetail(FindingSourceDetail detail) {
        setDetail(detail);
        return this;
    }

    /**
     * <p>
     * Indicates the type of access that generated the finding.
     * </p>
     * 
     * @param type
     *        Indicates the type of access that generated the finding.
     * @see FindingSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates the type of access that generated the finding.
     * </p>
     * 
     * @return Indicates the type of access that generated the finding.
     * @see FindingSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Indicates the type of access that generated the finding.
     * </p>
     * 
     * @param type
     *        Indicates the type of access that generated the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingSourceType
     */

    public FindingSource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates the type of access that generated the finding.
     * </p>
     * 
     * @param type
     *        Indicates the type of access that generated the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingSourceType
     */

    public FindingSource withType(FindingSourceType type) {
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
        if (getDetail() != null)
            sb.append("Detail: ").append(getDetail()).append(",");
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

        if (obj instanceof FindingSource == false)
            return false;
        FindingSource other = (FindingSource) obj;
        if (other.getDetail() == null ^ this.getDetail() == null)
            return false;
        if (other.getDetail() != null && other.getDetail().equals(this.getDetail()) == false)
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

        hashCode = prime * hashCode + ((getDetail() == null) ? 0 : getDetail().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public FindingSource clone() {
        try {
            return (FindingSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.FindingSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
