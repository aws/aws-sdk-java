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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides metadata for the Amazon CodeGuru detector associated with a finding. This field pertains to findings that
 * relate to Lambda functions. Amazon Inspector identifies policy violations and vulnerabilities in Lambda function code
 * based on internal detectors developed in collaboration with Amazon CodeGuru. Security Hub receives those findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GeneratorDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeneratorDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the detector used to identify the code vulnerability.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the detector used to identify the code vulnerability.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An array of tags used to identify the detector associated with the finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 0 items. Maximum number of 10 items.
     * </p>
     */
    private java.util.List<String> labels;

    /**
     * <p>
     * The name of the detector used to identify the code vulnerability.
     * </p>
     * 
     * @param name
     *        The name of the detector used to identify the code vulnerability.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the detector used to identify the code vulnerability.
     * </p>
     * 
     * @return The name of the detector used to identify the code vulnerability.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the detector used to identify the code vulnerability.
     * </p>
     * 
     * @param name
     *        The name of the detector used to identify the code vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratorDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the detector used to identify the code vulnerability.
     * </p>
     * 
     * @param description
     *        The description of the detector used to identify the code vulnerability.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the detector used to identify the code vulnerability.
     * </p>
     * 
     * @return The description of the detector used to identify the code vulnerability.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the detector used to identify the code vulnerability.
     * </p>
     * 
     * @param description
     *        The description of the detector used to identify the code vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratorDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An array of tags used to identify the detector associated with the finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 0 items. Maximum number of 10 items.
     * </p>
     * 
     * @return An array of tags used to identify the detector associated with the finding. </p>
     *         <p>
     *         Array Members: Minimum number of 0 items. Maximum number of 10 items.
     */

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * An array of tags used to identify the detector associated with the finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 0 items. Maximum number of 10 items.
     * </p>
     * 
     * @param labels
     *        An array of tags used to identify the detector associated with the finding. </p>
     *        <p>
     *        Array Members: Minimum number of 0 items. Maximum number of 10 items.
     */

    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * <p>
     * An array of tags used to identify the detector associated with the finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 0 items. Maximum number of 10 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        An array of tags used to identify the detector associated with the finding. </p>
     *        <p>
     *        Array Members: Minimum number of 0 items. Maximum number of 10 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratorDetails withLabels(String... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<String>(labels.length));
        }
        for (String ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of tags used to identify the detector associated with the finding.
     * </p>
     * <p>
     * Array Members: Minimum number of 0 items. Maximum number of 10 items.
     * </p>
     * 
     * @param labels
     *        An array of tags used to identify the detector associated with the finding. </p>
     *        <p>
     *        Array Members: Minimum number of 0 items. Maximum number of 10 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratorDetails withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeneratorDetails == false)
            return false;
        GeneratorDetails other = (GeneratorDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public GeneratorDetails clone() {
        try {
            return (GeneratorDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.GeneratorDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
