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
 * Information about the credentials for a GitHub, GitHub Enterprise, or Bitbucket repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/SourceCredentialsInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceCredentialsInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the token.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     * </p>
     */
    private String serverType;
    /**
     * <p>
     * The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or
     * PERSONAL_ACCESS_TOKEN.
     * </p>
     */
    private String authType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the token.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the token.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the token.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the token.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the token.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCredentialsInfo withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     * </p>
     * 
     * @param serverType
     *        The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     * @see ServerType
     */

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    /**
     * <p>
     * The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     * </p>
     * 
     * @return The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     * @see ServerType
     */

    public String getServerType() {
        return this.serverType;
    }

    /**
     * <p>
     * The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     * </p>
     * 
     * @param serverType
     *        The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerType
     */

    public SourceCredentialsInfo withServerType(String serverType) {
        setServerType(serverType);
        return this;
    }

    /**
     * <p>
     * The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     * </p>
     * 
     * @param serverType
     *        The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerType
     */

    public SourceCredentialsInfo withServerType(ServerType serverType) {
        this.serverType = serverType.toString();
        return this;
    }

    /**
     * <p>
     * The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or
     * PERSONAL_ACCESS_TOKEN.
     * </p>
     * 
     * @param authType
     *        The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or
     *        PERSONAL_ACCESS_TOKEN.
     * @see AuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or
     * PERSONAL_ACCESS_TOKEN.
     * </p>
     * 
     * @return The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or
     *         PERSONAL_ACCESS_TOKEN.
     * @see AuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or
     * PERSONAL_ACCESS_TOKEN.
     * </p>
     * 
     * @param authType
     *        The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or
     *        PERSONAL_ACCESS_TOKEN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public SourceCredentialsInfo withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or
     * PERSONAL_ACCESS_TOKEN.
     * </p>
     * 
     * @param authType
     *        The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or
     *        PERSONAL_ACCESS_TOKEN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public SourceCredentialsInfo withAuthType(AuthType authType) {
        this.authType = authType.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getServerType() != null)
            sb.append("ServerType: ").append(getServerType()).append(",");
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceCredentialsInfo == false)
            return false;
        SourceCredentialsInfo other = (SourceCredentialsInfo) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getServerType() == null ^ this.getServerType() == null)
            return false;
        if (other.getServerType() != null && other.getServerType().equals(this.getServerType()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getServerType() == null) ? 0 : getServerType().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        return hashCode;
    }

    @Override
    public SourceCredentialsInfo clone() {
        try {
            return (SourceCredentialsInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.SourceCredentialsInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
