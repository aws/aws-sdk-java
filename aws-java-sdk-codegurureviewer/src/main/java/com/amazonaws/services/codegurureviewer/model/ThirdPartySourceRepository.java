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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a third-party source repository connected to CodeGuru Reviewer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ThirdPartySourceRepository"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThirdPartySourceRepository implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the third party source repository.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     * <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html">Connection</a> in
     * the <i>AWS CodeStar Connections API Reference</i>.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * The owner of the repository. For a GitHub, GitHub Enterprise, or Bitbucket repository, this is the username for
     * the account that owns the repository.
     * </p>
     */
    private String owner;

    /**
     * <p>
     * The name of the third party source repository.
     * </p>
     * 
     * @param name
     *        The name of the third party source repository.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the third party source repository.
     * </p>
     * 
     * @return The name of the third party source repository.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the third party source repository.
     * </p>
     * 
     * @param name
     *        The name of the third party source repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartySourceRepository withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     * <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html">Connection</a> in
     * the <i>AWS CodeStar Connections API Reference</i>.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     *        <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html"
     *        >Connection</a> in the <i>AWS CodeStar Connections API Reference</i>.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     * <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html">Connection</a> in
     * the <i>AWS CodeStar Connections API Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     *         <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html"
     *         >Connection</a> in the <i>AWS CodeStar Connections API Reference</i>.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     * <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html">Connection</a> in
     * the <i>AWS CodeStar Connections API Reference</i>.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is
     *        <code>arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id</code>. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html"
     *        >Connection</a> in the <i>AWS CodeStar Connections API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartySourceRepository withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * The owner of the repository. For a GitHub, GitHub Enterprise, or Bitbucket repository, this is the username for
     * the account that owns the repository.
     * </p>
     * 
     * @param owner
     *        The owner of the repository. For a GitHub, GitHub Enterprise, or Bitbucket repository, this is the
     *        username for the account that owns the repository.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the repository. For a GitHub, GitHub Enterprise, or Bitbucket repository, this is the username for
     * the account that owns the repository.
     * </p>
     * 
     * @return The owner of the repository. For a GitHub, GitHub Enterprise, or Bitbucket repository, this is the
     *         username for the account that owns the repository.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the repository. For a GitHub, GitHub Enterprise, or Bitbucket repository, this is the username for
     * the account that owns the repository.
     * </p>
     * 
     * @param owner
     *        The owner of the repository. For a GitHub, GitHub Enterprise, or Bitbucket repository, this is the
     *        username for the account that owns the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartySourceRepository withOwner(String owner) {
        setOwner(owner);
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
        if (getConnectionArn() != null)
            sb.append("ConnectionArn: ").append(getConnectionArn()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThirdPartySourceRepository == false)
            return false;
        ThirdPartySourceRepository other = (ThirdPartySourceRepository) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return hashCode;
    }

    @Override
    public ThirdPartySourceRepository clone() {
        try {
            return (ThirdPartySourceRepository) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.ThirdPartySourceRepositoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
