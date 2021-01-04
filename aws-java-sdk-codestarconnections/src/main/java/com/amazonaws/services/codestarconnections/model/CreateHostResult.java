/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateHost" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHostResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host to be created.
     * </p>
     */
    private String hostArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host to be created.
     * </p>
     * 
     * @param hostArn
     *        The Amazon Resource Name (ARN) of the host to be created.
     */

    public void setHostArn(String hostArn) {
        this.hostArn = hostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host to be created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the host to be created.
     */

    public String getHostArn() {
        return this.hostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host to be created.
     * </p>
     * 
     * @param hostArn
     *        The Amazon Resource Name (ARN) of the host to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostResult withHostArn(String hostArn) {
        setHostArn(hostArn);
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
        if (getHostArn() != null)
            sb.append("HostArn: ").append(getHostArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHostResult == false)
            return false;
        CreateHostResult other = (CreateHostResult) obj;
        if (other.getHostArn() == null ^ this.getHostArn() == null)
            return false;
        if (other.getHostArn() != null && other.getHostArn().equals(this.getHostArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostArn() == null) ? 0 : getHostArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateHostResult clone() {
        try {
            return (CreateHostResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
