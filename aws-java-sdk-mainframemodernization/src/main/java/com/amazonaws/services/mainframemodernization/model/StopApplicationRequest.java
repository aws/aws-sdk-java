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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StopApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the application you want to stop.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * Stopping an application process can take a long time. Setting this parameter to true lets you force stop the
     * application so you don't need to wait until the process finishes to apply another action on the application. The
     * default value is false.
     * </p>
     */
    private Boolean forceStop;

    /**
     * <p>
     * The unique identifier of the application you want to stop.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application you want to stop.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application you want to stop.
     * </p>
     * 
     * @return The unique identifier of the application you want to stop.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application you want to stop.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application you want to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopApplicationRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * Stopping an application process can take a long time. Setting this parameter to true lets you force stop the
     * application so you don't need to wait until the process finishes to apply another action on the application. The
     * default value is false.
     * </p>
     * 
     * @param forceStop
     *        Stopping an application process can take a long time. Setting this parameter to true lets you force stop
     *        the application so you don't need to wait until the process finishes to apply another action on the
     *        application. The default value is false.
     */

    public void setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
    }

    /**
     * <p>
     * Stopping an application process can take a long time. Setting this parameter to true lets you force stop the
     * application so you don't need to wait until the process finishes to apply another action on the application. The
     * default value is false.
     * </p>
     * 
     * @return Stopping an application process can take a long time. Setting this parameter to true lets you force stop
     *         the application so you don't need to wait until the process finishes to apply another action on the
     *         application. The default value is false.
     */

    public Boolean getForceStop() {
        return this.forceStop;
    }

    /**
     * <p>
     * Stopping an application process can take a long time. Setting this parameter to true lets you force stop the
     * application so you don't need to wait until the process finishes to apply another action on the application. The
     * default value is false.
     * </p>
     * 
     * @param forceStop
     *        Stopping an application process can take a long time. Setting this parameter to true lets you force stop
     *        the application so you don't need to wait until the process finishes to apply another action on the
     *        application. The default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopApplicationRequest withForceStop(Boolean forceStop) {
        setForceStop(forceStop);
        return this;
    }

    /**
     * <p>
     * Stopping an application process can take a long time. Setting this parameter to true lets you force stop the
     * application so you don't need to wait until the process finishes to apply another action on the application. The
     * default value is false.
     * </p>
     * 
     * @return Stopping an application process can take a long time. Setting this parameter to true lets you force stop
     *         the application so you don't need to wait until the process finishes to apply another action on the
     *         application. The default value is false.
     */

    public Boolean isForceStop() {
        return this.forceStop;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getForceStop() != null)
            sb.append("ForceStop: ").append(getForceStop());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopApplicationRequest == false)
            return false;
        StopApplicationRequest other = (StopApplicationRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getForceStop() == null ^ this.getForceStop() == null)
            return false;
        if (other.getForceStop() != null && other.getForceStop().equals(this.getForceStop()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getForceStop() == null) ? 0 : getForceStop().hashCode());
        return hashCode;
    }

    @Override
    public StopApplicationRequest clone() {
        return (StopApplicationRequest) super.clone();
    }

}
