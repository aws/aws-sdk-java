/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentTemplateVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnvironmentTemplateVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The detailed data of the requested environment template version.
     * </p>
     */
    private EnvironmentTemplateVersion environmentTemplateVersion;

    /**
     * <p>
     * The detailed data of the requested environment template version.
     * </p>
     * 
     * @param environmentTemplateVersion
     *        The detailed data of the requested environment template version.
     */

    public void setEnvironmentTemplateVersion(EnvironmentTemplateVersion environmentTemplateVersion) {
        this.environmentTemplateVersion = environmentTemplateVersion;
    }

    /**
     * <p>
     * The detailed data of the requested environment template version.
     * </p>
     * 
     * @return The detailed data of the requested environment template version.
     */

    public EnvironmentTemplateVersion getEnvironmentTemplateVersion() {
        return this.environmentTemplateVersion;
    }

    /**
     * <p>
     * The detailed data of the requested environment template version.
     * </p>
     * 
     * @param environmentTemplateVersion
     *        The detailed data of the requested environment template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentTemplateVersionResult withEnvironmentTemplateVersion(EnvironmentTemplateVersion environmentTemplateVersion) {
        setEnvironmentTemplateVersion(environmentTemplateVersion);
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
        if (getEnvironmentTemplateVersion() != null)
            sb.append("EnvironmentTemplateVersion: ").append(getEnvironmentTemplateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnvironmentTemplateVersionResult == false)
            return false;
        GetEnvironmentTemplateVersionResult other = (GetEnvironmentTemplateVersionResult) obj;
        if (other.getEnvironmentTemplateVersion() == null ^ this.getEnvironmentTemplateVersion() == null)
            return false;
        if (other.getEnvironmentTemplateVersion() != null && other.getEnvironmentTemplateVersion().equals(this.getEnvironmentTemplateVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentTemplateVersion() == null) ? 0 : getEnvironmentTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetEnvironmentTemplateVersionResult clone() {
        try {
            return (GetEnvironmentTemplateVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
