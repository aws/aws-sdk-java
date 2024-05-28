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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/UpdateEnabledBaseline" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnabledBaselineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the new <code>Baseline</code> version, to which the <code>EnabledBaseline</code> should be updated.
     * </p>
     */
    private String baselineVersion;
    /**
     * <p>
     * Specifies the <code>EnabledBaseline</code> resource to be updated.
     * </p>
     */
    private String enabledBaselineIdentifier;

    /**
     * <p>
     * Specifies the new <code>Baseline</code> version, to which the <code>EnabledBaseline</code> should be updated.
     * </p>
     * 
     * @param baselineVersion
     *        Specifies the new <code>Baseline</code> version, to which the <code>EnabledBaseline</code> should be
     *        updated.
     */

    public void setBaselineVersion(String baselineVersion) {
        this.baselineVersion = baselineVersion;
    }

    /**
     * <p>
     * Specifies the new <code>Baseline</code> version, to which the <code>EnabledBaseline</code> should be updated.
     * </p>
     * 
     * @return Specifies the new <code>Baseline</code> version, to which the <code>EnabledBaseline</code> should be
     *         updated.
     */

    public String getBaselineVersion() {
        return this.baselineVersion;
    }

    /**
     * <p>
     * Specifies the new <code>Baseline</code> version, to which the <code>EnabledBaseline</code> should be updated.
     * </p>
     * 
     * @param baselineVersion
     *        Specifies the new <code>Baseline</code> version, to which the <code>EnabledBaseline</code> should be
     *        updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnabledBaselineRequest withBaselineVersion(String baselineVersion) {
        setBaselineVersion(baselineVersion);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>EnabledBaseline</code> resource to be updated.
     * </p>
     * 
     * @param enabledBaselineIdentifier
     *        Specifies the <code>EnabledBaseline</code> resource to be updated.
     */

    public void setEnabledBaselineIdentifier(String enabledBaselineIdentifier) {
        this.enabledBaselineIdentifier = enabledBaselineIdentifier;
    }

    /**
     * <p>
     * Specifies the <code>EnabledBaseline</code> resource to be updated.
     * </p>
     * 
     * @return Specifies the <code>EnabledBaseline</code> resource to be updated.
     */

    public String getEnabledBaselineIdentifier() {
        return this.enabledBaselineIdentifier;
    }

    /**
     * <p>
     * Specifies the <code>EnabledBaseline</code> resource to be updated.
     * </p>
     * 
     * @param enabledBaselineIdentifier
     *        Specifies the <code>EnabledBaseline</code> resource to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnabledBaselineRequest withEnabledBaselineIdentifier(String enabledBaselineIdentifier) {
        setEnabledBaselineIdentifier(enabledBaselineIdentifier);
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
        if (getBaselineVersion() != null)
            sb.append("BaselineVersion: ").append(getBaselineVersion()).append(",");
        if (getEnabledBaselineIdentifier() != null)
            sb.append("EnabledBaselineIdentifier: ").append(getEnabledBaselineIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnabledBaselineRequest == false)
            return false;
        UpdateEnabledBaselineRequest other = (UpdateEnabledBaselineRequest) obj;
        if (other.getBaselineVersion() == null ^ this.getBaselineVersion() == null)
            return false;
        if (other.getBaselineVersion() != null && other.getBaselineVersion().equals(this.getBaselineVersion()) == false)
            return false;
        if (other.getEnabledBaselineIdentifier() == null ^ this.getEnabledBaselineIdentifier() == null)
            return false;
        if (other.getEnabledBaselineIdentifier() != null && other.getEnabledBaselineIdentifier().equals(this.getEnabledBaselineIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineVersion() == null) ? 0 : getBaselineVersion().hashCode());
        hashCode = prime * hashCode + ((getEnabledBaselineIdentifier() == null) ? 0 : getEnabledBaselineIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnabledBaselineRequest clone() {
        return (UpdateEnabledBaselineRequest) super.clone();
    }

}
