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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkteam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkteamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>Workteam</code> object that describes the updated work team.
     * </p>
     */
    private Workteam workteam;

    /**
     * <p>
     * A <code>Workteam</code> object that describes the updated work team.
     * </p>
     * 
     * @param workteam
     *        A <code>Workteam</code> object that describes the updated work team.
     */

    public void setWorkteam(Workteam workteam) {
        this.workteam = workteam;
    }

    /**
     * <p>
     * A <code>Workteam</code> object that describes the updated work team.
     * </p>
     * 
     * @return A <code>Workteam</code> object that describes the updated work team.
     */

    public Workteam getWorkteam() {
        return this.workteam;
    }

    /**
     * <p>
     * A <code>Workteam</code> object that describes the updated work team.
     * </p>
     * 
     * @param workteam
     *        A <code>Workteam</code> object that describes the updated work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkteamResult withWorkteam(Workteam workteam) {
        setWorkteam(workteam);
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
        if (getWorkteam() != null)
            sb.append("Workteam: ").append(getWorkteam());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkteamResult == false)
            return false;
        UpdateWorkteamResult other = (UpdateWorkteamResult) obj;
        if (other.getWorkteam() == null ^ this.getWorkteam() == null)
            return false;
        if (other.getWorkteam() != null && other.getWorkteam().equals(this.getWorkteam()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkteam() == null) ? 0 : getWorkteam().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkteamResult clone() {
        try {
            return (UpdateWorkteamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
