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
 * Specifies experiment options for an experiment template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/CreateExperimentTemplateExperimentOptionsInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExperimentTemplateExperimentOptionsInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the account targeting setting for experiment options.
     * </p>
     */
    private String accountTargeting;
    /**
     * <p>
     * Specifies the empty target resolution mode for experiment options.
     * </p>
     */
    private String emptyTargetResolutionMode;

    /**
     * <p>
     * Specifies the account targeting setting for experiment options.
     * </p>
     * 
     * @param accountTargeting
     *        Specifies the account targeting setting for experiment options.
     * @see AccountTargeting
     */

    public void setAccountTargeting(String accountTargeting) {
        this.accountTargeting = accountTargeting;
    }

    /**
     * <p>
     * Specifies the account targeting setting for experiment options.
     * </p>
     * 
     * @return Specifies the account targeting setting for experiment options.
     * @see AccountTargeting
     */

    public String getAccountTargeting() {
        return this.accountTargeting;
    }

    /**
     * <p>
     * Specifies the account targeting setting for experiment options.
     * </p>
     * 
     * @param accountTargeting
     *        Specifies the account targeting setting for experiment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountTargeting
     */

    public CreateExperimentTemplateExperimentOptionsInput withAccountTargeting(String accountTargeting) {
        setAccountTargeting(accountTargeting);
        return this;
    }

    /**
     * <p>
     * Specifies the account targeting setting for experiment options.
     * </p>
     * 
     * @param accountTargeting
     *        Specifies the account targeting setting for experiment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountTargeting
     */

    public CreateExperimentTemplateExperimentOptionsInput withAccountTargeting(AccountTargeting accountTargeting) {
        this.accountTargeting = accountTargeting.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the empty target resolution mode for experiment options.
     * </p>
     * 
     * @param emptyTargetResolutionMode
     *        Specifies the empty target resolution mode for experiment options.
     * @see EmptyTargetResolutionMode
     */

    public void setEmptyTargetResolutionMode(String emptyTargetResolutionMode) {
        this.emptyTargetResolutionMode = emptyTargetResolutionMode;
    }

    /**
     * <p>
     * Specifies the empty target resolution mode for experiment options.
     * </p>
     * 
     * @return Specifies the empty target resolution mode for experiment options.
     * @see EmptyTargetResolutionMode
     */

    public String getEmptyTargetResolutionMode() {
        return this.emptyTargetResolutionMode;
    }

    /**
     * <p>
     * Specifies the empty target resolution mode for experiment options.
     * </p>
     * 
     * @param emptyTargetResolutionMode
     *        Specifies the empty target resolution mode for experiment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmptyTargetResolutionMode
     */

    public CreateExperimentTemplateExperimentOptionsInput withEmptyTargetResolutionMode(String emptyTargetResolutionMode) {
        setEmptyTargetResolutionMode(emptyTargetResolutionMode);
        return this;
    }

    /**
     * <p>
     * Specifies the empty target resolution mode for experiment options.
     * </p>
     * 
     * @param emptyTargetResolutionMode
     *        Specifies the empty target resolution mode for experiment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmptyTargetResolutionMode
     */

    public CreateExperimentTemplateExperimentOptionsInput withEmptyTargetResolutionMode(EmptyTargetResolutionMode emptyTargetResolutionMode) {
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

        if (obj instanceof CreateExperimentTemplateExperimentOptionsInput == false)
            return false;
        CreateExperimentTemplateExperimentOptionsInput other = (CreateExperimentTemplateExperimentOptionsInput) obj;
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
    public CreateExperimentTemplateExperimentOptionsInput clone() {
        try {
            return (CreateExperimentTemplateExperimentOptionsInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.CreateExperimentTemplateExperimentOptionsInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
