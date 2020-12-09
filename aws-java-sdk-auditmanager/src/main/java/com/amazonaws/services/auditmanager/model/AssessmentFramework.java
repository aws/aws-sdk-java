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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The file used to structure and automate AWS Audit Manager assessments for a given compliance standard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssessmentFramework" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentFramework implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the framework.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified framework.
     * </p>
     */
    private String arn;

    private FrameworkMetadata metadata;
    /**
     * <p>
     * The control sets associated with the framework.
     * </p>
     */
    private java.util.List<AssessmentControlSet> controlSets;

    /**
     * <p>
     * The unique identifier for the framework.
     * </p>
     * 
     * @param id
     *        The unique identifier for the framework.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the framework.
     * </p>
     * 
     * @return The unique identifier for the framework.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the framework.
     * </p>
     * 
     * @param id
     *        The unique identifier for the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFramework withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified framework.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified framework.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified framework.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified framework.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified framework.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFramework withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param metadata
     */

    public void setMetadata(FrameworkMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * @return
     */

    public FrameworkMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * @param metadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFramework withMetadata(FrameworkMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The control sets associated with the framework.
     * </p>
     * 
     * @return The control sets associated with the framework.
     */

    public java.util.List<AssessmentControlSet> getControlSets() {
        return controlSets;
    }

    /**
     * <p>
     * The control sets associated with the framework.
     * </p>
     * 
     * @param controlSets
     *        The control sets associated with the framework.
     */

    public void setControlSets(java.util.Collection<AssessmentControlSet> controlSets) {
        if (controlSets == null) {
            this.controlSets = null;
            return;
        }

        this.controlSets = new java.util.ArrayList<AssessmentControlSet>(controlSets);
    }

    /**
     * <p>
     * The control sets associated with the framework.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControlSets(java.util.Collection)} or {@link #withControlSets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param controlSets
     *        The control sets associated with the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFramework withControlSets(AssessmentControlSet... controlSets) {
        if (this.controlSets == null) {
            setControlSets(new java.util.ArrayList<AssessmentControlSet>(controlSets.length));
        }
        for (AssessmentControlSet ele : controlSets) {
            this.controlSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The control sets associated with the framework.
     * </p>
     * 
     * @param controlSets
     *        The control sets associated with the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFramework withControlSets(java.util.Collection<AssessmentControlSet> controlSets) {
        setControlSets(controlSets);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getControlSets() != null)
            sb.append("ControlSets: ").append(getControlSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentFramework == false)
            return false;
        AssessmentFramework other = (AssessmentFramework) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getControlSets() == null ^ this.getControlSets() == null)
            return false;
        if (other.getControlSets() != null && other.getControlSets().equals(this.getControlSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getControlSets() == null) ? 0 : getControlSets().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentFramework clone() {
        try {
            return (AssessmentFramework) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.AssessmentFrameworkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
