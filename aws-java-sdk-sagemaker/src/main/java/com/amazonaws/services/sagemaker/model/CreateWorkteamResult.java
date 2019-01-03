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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateWorkteam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkteamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team. You can use this ARN to identify the work team.
     * </p>
     */
    private String workteamArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team. You can use this ARN to identify the work team.
     * </p>
     * 
     * @param workteamArn
     *        The Amazon Resource Name (ARN) of the work team. You can use this ARN to identify the work team.
     */

    public void setWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team. You can use this ARN to identify the work team.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the work team. You can use this ARN to identify the work team.
     */

    public String getWorkteamArn() {
        return this.workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team. You can use this ARN to identify the work team.
     * </p>
     * 
     * @param workteamArn
     *        The Amazon Resource Name (ARN) of the work team. You can use this ARN to identify the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamResult withWorkteamArn(String workteamArn) {
        setWorkteamArn(workteamArn);
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
        if (getWorkteamArn() != null)
            sb.append("WorkteamArn: ").append(getWorkteamArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkteamResult == false)
            return false;
        CreateWorkteamResult other = (CreateWorkteamResult) obj;
        if (other.getWorkteamArn() == null ^ this.getWorkteamArn() == null)
            return false;
        if (other.getWorkteamArn() != null && other.getWorkteamArn().equals(this.getWorkteamArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkteamArn() == null) ? 0 : getWorkteamArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkteamResult clone() {
        try {
            return (CreateWorkteamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
