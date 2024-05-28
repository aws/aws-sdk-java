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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the experiment options for an experiment template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ExperimentTemplateExperimentOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentTemplateExperimentOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account targeting setting for an experiment template.
     * </p>
     */
    private String accountTargeting;
    /**
     * <p>
     * The empty target resolution mode for an experiment template.
     * </p>
     */
    private String emptyTargetResolutionMode;

    /**
     * <p>
     * The account targeting setting for an experiment template.
     * </p>
     * 
     * @param accountTargeting
     *        The account targeting setting for an experiment template.
     * @see AccountTargeting
     */

    public void setAccountTargeting(String accountTargeting) {
        this.accountTargeting = accountTargeting;
    }

    /**
     * <p>
     * The account targeting setting for an experiment template.
     * </p>
     * 
     * @return The account targeting setting for an experiment template.
     * @see AccountTargeting
     */

    public String getAccountTargeting() {
        return this.accountTargeting;
    }

    /**
     * <p>
     * The account targeting setting for an experiment template.
     * </p>
     * 
     * @param accountTargeting
     *        The account targeting setting for an experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountTargeting
     */

    public ExperimentTemplateExperimentOptions withAccountTargeting(String accountTargeting) {
        setAccountTargeting(accountTargeting);
        return this;
    }

    /**
     * <p>
     * The account targeting setting for an experiment template.
     * </p>
     * 
     * @param accountTargeting
     *        The account targeting setting for an experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountTargeting
     */

    public ExperimentTemplateExperimentOptions withAccountTargeting(AccountTargeting accountTargeting) {
        this.accountTargeting = accountTargeting.toString();
        return this;
    }

    /**
     * <p>
     * The empty target resolution mode for an experiment template.
     * </p>
     * 
     * @param emptyTargetResolutionMode
     *        The empty target resolution mode for an experiment template.
     * @see EmptyTargetResolutionMode
     */

    public void setEmptyTargetResolutionMode(String emptyTargetResolutionMode) {
        this.emptyTargetResolutionMode = emptyTargetResolutionMode;
    }

    /**
     * <p>
     * The empty target resolution mode for an experiment template.
     * </p>
     * 
     * @return The empty target resolution mode for an experiment template.
     * @see EmptyTargetResolutionMode
     */

    public String getEmptyTargetResolutionMode() {
        return this.emptyTargetResolutionMode;
    }

    /**
     * <p>
     * The empty target resolution mode for an experiment template.
     * </p>
     * 
     * @param emptyTargetResolutionMode
     *        The empty target resolution mode for an experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmptyTargetResolutionMode
     */

    public ExperimentTemplateExperimentOptions withEmptyTargetResolutionMode(String emptyTargetResolutionMode) {
        setEmptyTargetResolutionMode(emptyTargetResolutionMode);
        return this;
    }

    /**
     * <p>
     * The empty target resolution mode for an experiment template.
     * </p>
     * 
     * @param emptyTargetResolutionMode
     *        The empty target resolution mode for an experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmptyTargetResolutionMode
     */

    public ExperimentTemplateExperimentOptions withEmptyTargetResolutionMode(EmptyTargetResolutionMode emptyTargetResolutionMode) {
        this.emptyTargetResolutionMode = emptyTargetResolutionMode.toString();
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
        if (getAccountTargeting() != null)
            sb.append("AccountTargeting: ").append(getAccountTargeting()).append(",");
        if (getEmptyTargetResolutionMode() != null)
            sb.append("EmptyTargetResolutionMode: ").append(getEmptyTargetResolutionMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperimentTemplateExperimentOptions == false)
            return false;
        ExperimentTemplateExperimentOptions other = (ExperimentTemplateExperimentOptions) obj;
        if (other.getAccountTargeting() == null ^ this.getAccountTargeting() == null)
            return false;
        if (other.getAccountTargeting() != null && other.getAccountTargeting().equals(this.getAccountTargeting()) == false)
            return false;
        if (other.getEmptyTargetResolutionMode() == null ^ this.getEmptyTargetResolutionMode() == null)
            return false;
        if (other.getEmptyTargetResolutionMode() != null && other.getEmptyTargetResolutionMode().equals(this.getEmptyTargetResolutionMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountTargeting() == null) ? 0 : getAccountTargeting().hashCode());
        hashCode = prime * hashCode + ((getEmptyTargetResolutionMode() == null) ? 0 : getEmptyTargetResolutionMode().hashCode());
        return hashCode;
    }

    @Override
    public ExperimentTemplateExperimentOptions clone() {
        try {
            return (ExperimentTemplateExperimentOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.ExperimentTemplateExperimentOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
