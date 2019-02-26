/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of Docker images that are related by platform and are managed by AWS CodeBuild.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/EnvironmentPlatform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentPlatform implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The platform's name.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The list of programming languages that are available for the specified platform.
     * </p>
     */
    private java.util.List<EnvironmentLanguage> languages;

    /**
     * <p>
     * The platform's name.
     * </p>
     * 
     * @param platform
     *        The platform's name.
     * @see PlatformType
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform's name.
     * </p>
     * 
     * @return The platform's name.
     * @see PlatformType
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform's name.
     * </p>
     * 
     * @param platform
     *        The platform's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public EnvironmentPlatform withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform's name.
     * </p>
     * 
     * @param platform
     *        The platform's name.
     * @see PlatformType
     */

    public void setPlatform(PlatformType platform) {
        withPlatform(platform);
    }

    /**
     * <p>
     * The platform's name.
     * </p>
     * 
     * @param platform
     *        The platform's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public EnvironmentPlatform withPlatform(PlatformType platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The list of programming languages that are available for the specified platform.
     * </p>
     * 
     * @return The list of programming languages that are available for the specified platform.
     */

    public java.util.List<EnvironmentLanguage> getLanguages() {
        return languages;
    }

    /**
     * <p>
     * The list of programming languages that are available for the specified platform.
     * </p>
     * 
     * @param languages
     *        The list of programming languages that are available for the specified platform.
     */

    public void setLanguages(java.util.Collection<EnvironmentLanguage> languages) {
        if (languages == null) {
            this.languages = null;
            return;
        }

        this.languages = new java.util.ArrayList<EnvironmentLanguage>(languages);
    }

    /**
     * <p>
     * The list of programming languages that are available for the specified platform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLanguages(java.util.Collection)} or {@link #withLanguages(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param languages
     *        The list of programming languages that are available for the specified platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentPlatform withLanguages(EnvironmentLanguage... languages) {
        if (this.languages == null) {
            setLanguages(new java.util.ArrayList<EnvironmentLanguage>(languages.length));
        }
        for (EnvironmentLanguage ele : languages) {
            this.languages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of programming languages that are available for the specified platform.
     * </p>
     * 
     * @param languages
     *        The list of programming languages that are available for the specified platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentPlatform withLanguages(java.util.Collection<EnvironmentLanguage> languages) {
        setLanguages(languages);
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
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getLanguages() != null)
            sb.append("Languages: ").append(getLanguages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentPlatform == false)
            return false;
        EnvironmentPlatform other = (EnvironmentPlatform) obj;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getLanguages() == null ^ this.getLanguages() == null)
            return false;
        if (other.getLanguages() != null && other.getLanguages().equals(this.getLanguages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getLanguages() == null) ? 0 : getLanguages().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentPlatform clone() {
        try {
            return (EnvironmentPlatform) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.EnvironmentPlatformMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
