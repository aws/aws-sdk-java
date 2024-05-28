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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates the type of data that is being exported. Only one <code>ExportPreferences</code> can be enabled for a <a
 * href
 * ="https://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html">StartExportTask</a>
 * action.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportPreferences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If enabled, exported data includes EC2 instance type matches for on-premises servers discovered through Amazon
     * Web Services Application Discovery Service.
     * </p>
     */
    private Ec2RecommendationsExportPreferences ec2RecommendationsPreferences;

    /**
     * <p>
     * If enabled, exported data includes EC2 instance type matches for on-premises servers discovered through Amazon
     * Web Services Application Discovery Service.
     * </p>
     * 
     * @param ec2RecommendationsPreferences
     *        If enabled, exported data includes EC2 instance type matches for on-premises servers discovered through
     *        Amazon Web Services Application Discovery Service.
     */

    public void setEc2RecommendationsPreferences(Ec2RecommendationsExportPreferences ec2RecommendationsPreferences) {
        this.ec2RecommendationsPreferences = ec2RecommendationsPreferences;
    }

    /**
     * <p>
     * If enabled, exported data includes EC2 instance type matches for on-premises servers discovered through Amazon
     * Web Services Application Discovery Service.
     * </p>
     * 
     * @return If enabled, exported data includes EC2 instance type matches for on-premises servers discovered through
     *         Amazon Web Services Application Discovery Service.
     */

    public Ec2RecommendationsExportPreferences getEc2RecommendationsPreferences() {
        return this.ec2RecommendationsPreferences;
    }

    /**
     * <p>
     * If enabled, exported data includes EC2 instance type matches for on-premises servers discovered through Amazon
     * Web Services Application Discovery Service.
     * </p>
     * 
     * @param ec2RecommendationsPreferences
     *        If enabled, exported data includes EC2 instance type matches for on-premises servers discovered through
     *        Amazon Web Services Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportPreferences withEc2RecommendationsPreferences(Ec2RecommendationsExportPreferences ec2RecommendationsPreferences) {
        setEc2RecommendationsPreferences(ec2RecommendationsPreferences);
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
        if (getEc2RecommendationsPreferences() != null)
            sb.append("Ec2RecommendationsPreferences: ").append(getEc2RecommendationsPreferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportPreferences == false)
            return false;
        ExportPreferences other = (ExportPreferences) obj;
        if (other.getEc2RecommendationsPreferences() == null ^ this.getEc2RecommendationsPreferences() == null)
            return false;
        if (other.getEc2RecommendationsPreferences() != null
                && other.getEc2RecommendationsPreferences().equals(this.getEc2RecommendationsPreferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEc2RecommendationsPreferences() == null) ? 0 : getEc2RecommendationsPreferences().hashCode());
        return hashCode;
    }

    @Override
    public ExportPreferences clone() {
        try {
            return (ExportPreferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.ExportPreferencesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
