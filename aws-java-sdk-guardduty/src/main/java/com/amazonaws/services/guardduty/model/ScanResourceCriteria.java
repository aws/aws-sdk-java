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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about criteria used to filter resources before triggering malware scan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ScanResourceCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScanResourceCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents condition that when matched will allow a malware scan for a certain resource.
     * </p>
     */
    private java.util.Map<String, ScanCondition> include;
    /**
     * <p>
     * Represents condition that when matched will prevent a malware scan for a certain resource.
     * </p>
     */
    private java.util.Map<String, ScanCondition> exclude;

    /**
     * <p>
     * Represents condition that when matched will allow a malware scan for a certain resource.
     * </p>
     * 
     * @return Represents condition that when matched will allow a malware scan for a certain resource.
     */

    public java.util.Map<String, ScanCondition> getInclude() {
        return include;
    }

    /**
     * <p>
     * Represents condition that when matched will allow a malware scan for a certain resource.
     * </p>
     * 
     * @param include
     *        Represents condition that when matched will allow a malware scan for a certain resource.
     */

    public void setInclude(java.util.Map<String, ScanCondition> include) {
        this.include = include;
    }

    /**
     * <p>
     * Represents condition that when matched will allow a malware scan for a certain resource.
     * </p>
     * 
     * @param include
     *        Represents condition that when matched will allow a malware scan for a certain resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanResourceCriteria withInclude(java.util.Map<String, ScanCondition> include) {
        setInclude(include);
        return this;
    }

    /**
     * Add a single Include entry
     *
     * @see ScanResourceCriteria#withInclude
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ScanResourceCriteria addIncludeEntry(String key, ScanCondition value) {
        if (null == this.include) {
            this.include = new java.util.HashMap<String, ScanCondition>();
        }
        if (this.include.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.include.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Include.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanResourceCriteria clearIncludeEntries() {
        this.include = null;
        return this;
    }

    /**
     * <p>
     * Represents condition that when matched will prevent a malware scan for a certain resource.
     * </p>
     * 
     * @return Represents condition that when matched will prevent a malware scan for a certain resource.
     */

    public java.util.Map<String, ScanCondition> getExclude() {
        return exclude;
    }

    /**
     * <p>
     * Represents condition that when matched will prevent a malware scan for a certain resource.
     * </p>
     * 
     * @param exclude
     *        Represents condition that when matched will prevent a malware scan for a certain resource.
     */

    public void setExclude(java.util.Map<String, ScanCondition> exclude) {
        this.exclude = exclude;
    }

    /**
     * <p>
     * Represents condition that when matched will prevent a malware scan for a certain resource.
     * </p>
     * 
     * @param exclude
     *        Represents condition that when matched will prevent a malware scan for a certain resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanResourceCriteria withExclude(java.util.Map<String, ScanCondition> exclude) {
        setExclude(exclude);
        return this;
    }

    /**
     * Add a single Exclude entry
     *
     * @see ScanResourceCriteria#withExclude
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ScanResourceCriteria addExcludeEntry(String key, ScanCondition value) {
        if (null == this.exclude) {
            this.exclude = new java.util.HashMap<String, ScanCondition>();
        }
        if (this.exclude.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.exclude.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Exclude.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanResourceCriteria clearExcludeEntries() {
        this.exclude = null;
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
        if (getInclude() != null)
            sb.append("Include: ").append(getInclude()).append(",");
        if (getExclude() != null)
            sb.append("Exclude: ").append(getExclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanResourceCriteria == false)
            return false;
        ScanResourceCriteria other = (ScanResourceCriteria) obj;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        if (other.getExclude() == null ^ this.getExclude() == null)
            return false;
        if (other.getExclude() != null && other.getExclude().equals(this.getExclude()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        hashCode = prime * hashCode + ((getExclude() == null) ? 0 : getExclude().hashCode());
        return hashCode;
    }

    @Override
    public ScanResourceCriteria clone() {
        try {
            return (ScanResourceCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ScanResourceCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
