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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An instance of a threat intelligence detail that constitutes evidence for the finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ThreatIntelligenceDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThreatIntelligenceDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the threat intelligence list that triggered the finding.
     * </p>
     */
    private String threatListName;
    /**
     * <p>
     * A list of names of the threats in the threat intelligence list that triggered the finding.
     * </p>
     */
    private java.util.List<String> threatNames;

    /**
     * <p>
     * The name of the threat intelligence list that triggered the finding.
     * </p>
     * 
     * @param threatListName
     *        The name of the threat intelligence list that triggered the finding.
     */

    public void setThreatListName(String threatListName) {
        this.threatListName = threatListName;
    }

    /**
     * <p>
     * The name of the threat intelligence list that triggered the finding.
     * </p>
     * 
     * @return The name of the threat intelligence list that triggered the finding.
     */

    public String getThreatListName() {
        return this.threatListName;
    }

    /**
     * <p>
     * The name of the threat intelligence list that triggered the finding.
     * </p>
     * 
     * @param threatListName
     *        The name of the threat intelligence list that triggered the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThreatIntelligenceDetail withThreatListName(String threatListName) {
        setThreatListName(threatListName);
        return this;
    }

    /**
     * <p>
     * A list of names of the threats in the threat intelligence list that triggered the finding.
     * </p>
     * 
     * @return A list of names of the threats in the threat intelligence list that triggered the finding.
     */

    public java.util.List<String> getThreatNames() {
        return threatNames;
    }

    /**
     * <p>
     * A list of names of the threats in the threat intelligence list that triggered the finding.
     * </p>
     * 
     * @param threatNames
     *        A list of names of the threats in the threat intelligence list that triggered the finding.
     */

    public void setThreatNames(java.util.Collection<String> threatNames) {
        if (threatNames == null) {
            this.threatNames = null;
            return;
        }

        this.threatNames = new java.util.ArrayList<String>(threatNames);
    }

    /**
     * <p>
     * A list of names of the threats in the threat intelligence list that triggered the finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThreatNames(java.util.Collection)} or {@link #withThreatNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param threatNames
     *        A list of names of the threats in the threat intelligence list that triggered the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThreatIntelligenceDetail withThreatNames(String... threatNames) {
        if (this.threatNames == null) {
            setThreatNames(new java.util.ArrayList<String>(threatNames.length));
        }
        for (String ele : threatNames) {
            this.threatNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of the threats in the threat intelligence list that triggered the finding.
     * </p>
     * 
     * @param threatNames
     *        A list of names of the threats in the threat intelligence list that triggered the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThreatIntelligenceDetail withThreatNames(java.util.Collection<String> threatNames) {
        setThreatNames(threatNames);
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
        if (getThreatListName() != null)
            sb.append("ThreatListName: ").append(getThreatListName()).append(",");
        if (getThreatNames() != null)
            sb.append("ThreatNames: ").append(getThreatNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThreatIntelligenceDetail == false)
            return false;
        ThreatIntelligenceDetail other = (ThreatIntelligenceDetail) obj;
        if (other.getThreatListName() == null ^ this.getThreatListName() == null)
            return false;
        if (other.getThreatListName() != null && other.getThreatListName().equals(this.getThreatListName()) == false)
            return false;
        if (other.getThreatNames() == null ^ this.getThreatNames() == null)
            return false;
        if (other.getThreatNames() != null && other.getThreatNames().equals(this.getThreatNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThreatListName() == null) ? 0 : getThreatListName().hashCode());
        hashCode = prime * hashCode + ((getThreatNames() == null) ? 0 : getThreatNames().hashCode());
        return hashCode;
    }

    @Override
    public ThreatIntelligenceDetail clone() {
        try {
            return (ThreatIntelligenceDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ThreatIntelligenceDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
