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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties that specify the code generator for a generated code job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/Generator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Generator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target version of the GameSparks Game SDK.
     * </p>
     */
    private String gameSdkVersion;
    /**
     * <p>
     * The programming language for the generated code.
     * </p>
     * <p>
     * Not all languages are supported for each platform. For cases where multiple languages are supported, this
     * parameter specifies the language to be used. If this value is omitted, the default language for the target
     * platform will be used.
     * </p>
     */
    private String language;
    /**
     * <p>
     * The platform that will be used to run the generated code.
     * </p>
     */
    private String targetPlatform;

    /**
     * <p>
     * The target version of the GameSparks Game SDK.
     * </p>
     * 
     * @param gameSdkVersion
     *        The target version of the GameSparks Game SDK.
     */

    public void setGameSdkVersion(String gameSdkVersion) {
        this.gameSdkVersion = gameSdkVersion;
    }

    /**
     * <p>
     * The target version of the GameSparks Game SDK.
     * </p>
     * 
     * @return The target version of the GameSparks Game SDK.
     */

    public String getGameSdkVersion() {
        return this.gameSdkVersion;
    }

    /**
     * <p>
     * The target version of the GameSparks Game SDK.
     * </p>
     * 
     * @param gameSdkVersion
     *        The target version of the GameSparks Game SDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Generator withGameSdkVersion(String gameSdkVersion) {
        setGameSdkVersion(gameSdkVersion);
        return this;
    }

    /**
     * <p>
     * The programming language for the generated code.
     * </p>
     * <p>
     * Not all languages are supported for each platform. For cases where multiple languages are supported, this
     * parameter specifies the language to be used. If this value is omitted, the default language for the target
     * platform will be used.
     * </p>
     * 
     * @param language
     *        The programming language for the generated code.</p>
     *        <p>
     *        Not all languages are supported for each platform. For cases where multiple languages are supported, this
     *        parameter specifies the language to be used. If this value is omitted, the default language for the target
     *        platform will be used.
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The programming language for the generated code.
     * </p>
     * <p>
     * Not all languages are supported for each platform. For cases where multiple languages are supported, this
     * parameter specifies the language to be used. If this value is omitted, the default language for the target
     * platform will be used.
     * </p>
     * 
     * @return The programming language for the generated code.</p>
     *         <p>
     *         Not all languages are supported for each platform. For cases where multiple languages are supported, this
     *         parameter specifies the language to be used. If this value is omitted, the default language for the
     *         target platform will be used.
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The programming language for the generated code.
     * </p>
     * <p>
     * Not all languages are supported for each platform. For cases where multiple languages are supported, this
     * parameter specifies the language to be used. If this value is omitted, the default language for the target
     * platform will be used.
     * </p>
     * 
     * @param language
     *        The programming language for the generated code.</p>
     *        <p>
     *        Not all languages are supported for each platform. For cases where multiple languages are supported, this
     *        parameter specifies the language to be used. If this value is omitted, the default language for the target
     *        platform will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Generator withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The platform that will be used to run the generated code.
     * </p>
     * 
     * @param targetPlatform
     *        The platform that will be used to run the generated code.
     */

    public void setTargetPlatform(String targetPlatform) {
        this.targetPlatform = targetPlatform;
    }

    /**
     * <p>
     * The platform that will be used to run the generated code.
     * </p>
     * 
     * @return The platform that will be used to run the generated code.
     */

    public String getTargetPlatform() {
        return this.targetPlatform;
    }

    /**
     * <p>
     * The platform that will be used to run the generated code.
     * </p>
     * 
     * @param targetPlatform
     *        The platform that will be used to run the generated code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Generator withTargetPlatform(String targetPlatform) {
        setTargetPlatform(targetPlatform);
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
        if (getGameSdkVersion() != null)
            sb.append("GameSdkVersion: ").append(getGameSdkVersion()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getTargetPlatform() != null)
            sb.append("TargetPlatform: ").append(getTargetPlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Generator == false)
            return false;
        Generator other = (Generator) obj;
        if (other.getGameSdkVersion() == null ^ this.getGameSdkVersion() == null)
            return false;
        if (other.getGameSdkVersion() != null && other.getGameSdkVersion().equals(this.getGameSdkVersion()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getTargetPlatform() == null ^ this.getTargetPlatform() == null)
            return false;
        if (other.getTargetPlatform() != null && other.getTargetPlatform().equals(this.getTargetPlatform()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameSdkVersion() == null) ? 0 : getGameSdkVersion().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getTargetPlatform() == null) ? 0 : getTargetPlatform().hashCode());
        return hashCode;
    }

    @Override
    public Generator clone() {
        try {
            return (Generator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamesparks.model.transform.GeneratorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
