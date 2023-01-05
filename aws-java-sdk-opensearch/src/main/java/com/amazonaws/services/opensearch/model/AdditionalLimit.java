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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List of limits that are specific to a given instance type.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdditionalLimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <ul>
     * <li>
     * <p>
     * <code>MaximumNumberOfDataNodesSupported</code> - This attribute only applies to master nodes and specifies the
     * maximum number of data nodes of a given instance type a master node can support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumNumberOfDataNodesWithoutMasterNode</code> - This attribute only applies to data nodes and specifies
     * the maximum number of data nodes of a given instance type can exist without a master node governing them.
     * </p>
     * </li>
     * </ul>
     */
    private String limitName;
    /**
     * <p>
     * The values of the additional instance type limits.
     * </p>
     */
    private java.util.List<String> limitValues;

    /**
     * <ul>
     * <li>
     * <p>
     * <code>MaximumNumberOfDataNodesSupported</code> - This attribute only applies to master nodes and specifies the
     * maximum number of data nodes of a given instance type a master node can support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumNumberOfDataNodesWithoutMasterNode</code> - This attribute only applies to data nodes and specifies
     * the maximum number of data nodes of a given instance type can exist without a master node governing them.
     * </p>
     * </li>
     * </ul>
     * 
     * @param limitName
     *        <li>
     *        <p>
     *        <code>MaximumNumberOfDataNodesSupported</code> - This attribute only applies to master nodes and specifies
     *        the maximum number of data nodes of a given instance type a master node can support.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>MaximumNumberOfDataNodesWithoutMasterNode</code> - This attribute only applies to data nodes and
     *        specifies the maximum number of data nodes of a given instance type can exist without a master node
     *        governing them.
     *        </p>
     *        </li>
     */

    public void setLimitName(String limitName) {
        this.limitName = limitName;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>MaximumNumberOfDataNodesSupported</code> - This attribute only applies to master nodes and specifies the
     * maximum number of data nodes of a given instance type a master node can support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumNumberOfDataNodesWithoutMasterNode</code> - This attribute only applies to data nodes and specifies
     * the maximum number of data nodes of a given instance type can exist without a master node governing them.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <li>
     *         <p>
     *         <code>MaximumNumberOfDataNodesSupported</code> - This attribute only applies to master nodes and
     *         specifies the maximum number of data nodes of a given instance type a master node can support.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>MaximumNumberOfDataNodesWithoutMasterNode</code> - This attribute only applies to data nodes and
     *         specifies the maximum number of data nodes of a given instance type can exist without a master node
     *         governing them.
     *         </p>
     *         </li>
     */

    public String getLimitName() {
        return this.limitName;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>MaximumNumberOfDataNodesSupported</code> - This attribute only applies to master nodes and specifies the
     * maximum number of data nodes of a given instance type a master node can support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaximumNumberOfDataNodesWithoutMasterNode</code> - This attribute only applies to data nodes and specifies
     * the maximum number of data nodes of a given instance type can exist without a master node governing them.
     * </p>
     * </li>
     * </ul>
     * 
     * @param limitName
     *        <li>
     *        <p>
     *        <code>MaximumNumberOfDataNodesSupported</code> - This attribute only applies to master nodes and specifies
     *        the maximum number of data nodes of a given instance type a master node can support.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <code>MaximumNumberOfDataNodesWithoutMasterNode</code> - This attribute only applies to data nodes and
     *        specifies the maximum number of data nodes of a given instance type can exist without a master node
     *        governing them.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalLimit withLimitName(String limitName) {
        setLimitName(limitName);
        return this;
    }

    /**
     * <p>
     * The values of the additional instance type limits.
     * </p>
     * 
     * @return The values of the additional instance type limits.
     */

    public java.util.List<String> getLimitValues() {
        return limitValues;
    }

    /**
     * <p>
     * The values of the additional instance type limits.
     * </p>
     * 
     * @param limitValues
     *        The values of the additional instance type limits.
     */

    public void setLimitValues(java.util.Collection<String> limitValues) {
        if (limitValues == null) {
            this.limitValues = null;
            return;
        }

        this.limitValues = new java.util.ArrayList<String>(limitValues);
    }

    /**
     * <p>
     * The values of the additional instance type limits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLimitValues(java.util.Collection)} or {@link #withLimitValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param limitValues
     *        The values of the additional instance type limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalLimit withLimitValues(String... limitValues) {
        if (this.limitValues == null) {
            setLimitValues(new java.util.ArrayList<String>(limitValues.length));
        }
        for (String ele : limitValues) {
            this.limitValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values of the additional instance type limits.
     * </p>
     * 
     * @param limitValues
     *        The values of the additional instance type limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalLimit withLimitValues(java.util.Collection<String> limitValues) {
        setLimitValues(limitValues);
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
        if (getLimitName() != null)
            sb.append("LimitName: ").append(getLimitName()).append(",");
        if (getLimitValues() != null)
            sb.append("LimitValues: ").append(getLimitValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdditionalLimit == false)
            return false;
        AdditionalLimit other = (AdditionalLimit) obj;
        if (other.getLimitName() == null ^ this.getLimitName() == null)
            return false;
        if (other.getLimitName() != null && other.getLimitName().equals(this.getLimitName()) == false)
            return false;
        if (other.getLimitValues() == null ^ this.getLimitValues() == null)
            return false;
        if (other.getLimitValues() != null && other.getLimitValues().equals(this.getLimitValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimitName() == null) ? 0 : getLimitName().hashCode());
        hashCode = prime * hashCode + ((getLimitValues() == null) ? 0 : getLimitValues().hashCode());
        return hashCode;
    }

    @Override
    public AdditionalLimit clone() {
        try {
            return (AdditionalLimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.AdditionalLimitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
