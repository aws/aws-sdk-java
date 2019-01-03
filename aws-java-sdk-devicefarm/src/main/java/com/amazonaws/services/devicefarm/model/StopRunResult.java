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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the results of your stop run attempt.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The run that was stopped.
     * </p>
     */
    private Run run;

    /**
     * <p>
     * The run that was stopped.
     * </p>
     * 
     * @param run
     *        The run that was stopped.
     */

    public void setRun(Run run) {
        this.run = run;
    }

    /**
     * <p>
     * The run that was stopped.
     * </p>
     * 
     * @return The run that was stopped.
     */

    public Run getRun() {
        return this.run;
    }

    /**
     * <p>
     * The run that was stopped.
     * </p>
     * 
     * @param run
     *        The run that was stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopRunResult withRun(Run run) {
        setRun(run);
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
        if (getRun() != null)
            sb.append("Run: ").append(getRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopRunResult == false)
            return false;
        StopRunResult other = (StopRunResult) obj;
        if (other.getRun() == null ^ this.getRun() == null)
            return false;
        if (other.getRun() != null && other.getRun().equals(this.getRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRun() == null) ? 0 : getRun().hashCode());
        return hashCode;
    }

    @Override
    public StopRunResult clone() {
        try {
            return (StopRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
