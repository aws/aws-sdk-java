/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A response that contains the results of a finding aggregation by image layer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/PackageAggregationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageAggregationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon Web Services account associated with the findings.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the operating system package.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * An object that contains the count of matched findings per severity.
     * </p>
     */
    private SeverityCounts severityCounts;

    /**
     * <p>
     * The ID of the Amazon Web Services account associated with the findings.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account associated with the findings.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account associated with the findings.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account associated with the findings.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account associated with the findings.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account associated with the findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageAggregationResponse withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the operating system package.
     * </p>
     * 
     * @param packageName
     *        The name of the operating system package.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The name of the operating system package.
     * </p>
     * 
     * @return The name of the operating system package.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * The name of the operating system package.
     * </p>
     * 
     * @param packageName
     *        The name of the operating system package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageAggregationResponse withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * An object that contains the count of matched findings per severity.
     * </p>
     * 
     * @param severityCounts
     *        An object that contains the count of matched findings per severity.
     */

    public void setSeverityCounts(SeverityCounts severityCounts) {
        this.severityCounts = severityCounts;
    }

    /**
     * <p>
     * An object that contains the count of matched findings per severity.
     * </p>
     * 
     * @return An object that contains the count of matched findings per severity.
     */

    public SeverityCounts getSeverityCounts() {
        return this.severityCounts;
    }

    /**
     * <p>
     * An object that contains the count of matched findings per severity.
     * </p>
     * 
     * @param severityCounts
     *        An object that contains the count of matched findings per severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageAggregationResponse withSeverityCounts(SeverityCounts severityCounts) {
        setSeverityCounts(severityCounts);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getSeverityCounts() != null)
            sb.append("SeverityCounts: ").append(getSeverityCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageAggregationResponse == false)
            return false;
        PackageAggregationResponse other = (PackageAggregationResponse) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getSeverityCounts() == null ^ this.getSeverityCounts() == null)
            return false;
        if (other.getSeverityCounts() != null && other.getSeverityCounts().equals(this.getSeverityCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getSeverityCounts() == null) ? 0 : getSeverityCounts().hashCode());
        return hashCode;
    }

    @Override
    public PackageAggregationResponse clone() {
        try {
            return (PackageAggregationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.PackageAggregationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
