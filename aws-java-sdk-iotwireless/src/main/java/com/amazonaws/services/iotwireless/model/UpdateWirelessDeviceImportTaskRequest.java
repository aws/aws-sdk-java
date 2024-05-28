/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateWirelessDeviceImportTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWirelessDeviceImportTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the import task to be updated.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Sidewalk-related parameters of the import task to be updated.
     * </p>
     */
    private SidewalkUpdateImportInfo sidewalk;

    /**
     * <p>
     * The identifier of the import task to be updated.
     * </p>
     * 
     * @param id
     *        The identifier of the import task to be updated.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the import task to be updated.
     * </p>
     * 
     * @return The identifier of the import task to be updated.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the import task to be updated.
     * </p>
     * 
     * @param id
     *        The identifier of the import task to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWirelessDeviceImportTaskRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Sidewalk-related parameters of the import task to be updated.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk-related parameters of the import task to be updated.
     */

    public void setSidewalk(SidewalkUpdateImportInfo sidewalk) {
        this.sidewalk = sidewalk;
    }

    /**
     * <p>
     * The Sidewalk-related parameters of the import task to be updated.
     * </p>
     * 
     * @return The Sidewalk-related parameters of the import task to be updated.
     */

    public SidewalkUpdateImportInfo getSidewalk() {
        return this.sidewalk;
    }

    /**
     * <p>
     * The Sidewalk-related parameters of the import task to be updated.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk-related parameters of the import task to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWirelessDeviceImportTaskRequest withSidewalk(SidewalkUpdateImportInfo sidewalk) {
        setSidewalk(sidewalk);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSidewalk() != null)
            sb.append("Sidewalk: ").append(getSidewalk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWirelessDeviceImportTaskRequest == false)
            return false;
        UpdateWirelessDeviceImportTaskRequest other = (UpdateWirelessDeviceImportTaskRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSidewalk() == null ^ this.getSidewalk() == null)
            return false;
        if (other.getSidewalk() != null && other.getSidewalk().equals(this.getSidewalk()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSidewalk() == null) ? 0 : getSidewalk().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWirelessDeviceImportTaskRequest clone() {
        return (UpdateWirelessDeviceImportTaskRequest) super.clone();
    }

}
