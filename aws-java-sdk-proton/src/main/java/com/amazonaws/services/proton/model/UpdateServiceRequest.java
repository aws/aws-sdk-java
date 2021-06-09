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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The edited service description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the service to edit.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Lists the service instances to add and the existing service instances to remain. Omit the existing service
     * instances to delete from the list. <i>Don't</i> include edits to the existing service instances or pipeline. For
     * more information, see <i>Edit a service</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-svc-update.html">AWS Proton Administration
     * Guide</a> or the <a href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-update.html">AWS Proton User
     * Guide</a>.
     * </p>
     */
    private String spec;

    /**
     * <p>
     * The edited service description.
     * </p>
     * 
     * @param description
     *        The edited service description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The edited service description.
     * </p>
     * 
     * @return The edited service description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The edited service description.
     * </p>
     * 
     * @param description
     *        The edited service description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the service to edit.
     * </p>
     * 
     * @param name
     *        The name of the service to edit.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service to edit.
     * </p>
     * 
     * @return The name of the service to edit.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service to edit.
     * </p>
     * 
     * @param name
     *        The name of the service to edit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Lists the service instances to add and the existing service instances to remain. Omit the existing service
     * instances to delete from the list. <i>Don't</i> include edits to the existing service instances or pipeline. For
     * more information, see <i>Edit a service</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-svc-update.html">AWS Proton Administration
     * Guide</a> or the <a href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-update.html">AWS Proton User
     * Guide</a>.
     * </p>
     * 
     * @param spec
     *        Lists the service instances to add and the existing service instances to remain. Omit the existing service
     *        instances to delete from the list. <i>Don't</i> include edits to the existing service instances or
     *        pipeline. For more information, see <i>Edit a service</i> in the <a
     *        href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-svc-update.html">AWS Proton Administration
     *        Guide</a> or the <a href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-update.html">AWS
     *        Proton User Guide</a>.
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * Lists the service instances to add and the existing service instances to remain. Omit the existing service
     * instances to delete from the list. <i>Don't</i> include edits to the existing service instances or pipeline. For
     * more information, see <i>Edit a service</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-svc-update.html">AWS Proton Administration
     * Guide</a> or the <a href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-update.html">AWS Proton User
     * Guide</a>.
     * </p>
     * 
     * @return Lists the service instances to add and the existing service instances to remain. Omit the existing
     *         service instances to delete from the list. <i>Don't</i> include edits to the existing service instances
     *         or pipeline. For more information, see <i>Edit a service</i> in the <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-svc-update.html">AWS Proton Administration
     *         Guide</a> or the <a href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-update.html">AWS
     *         Proton User Guide</a>.
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * Lists the service instances to add and the existing service instances to remain. Omit the existing service
     * instances to delete from the list. <i>Don't</i> include edits to the existing service instances or pipeline. For
     * more information, see <i>Edit a service</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-svc-update.html">AWS Proton Administration
     * Guide</a> or the <a href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-update.html">AWS Proton User
     * Guide</a>.
     * </p>
     * 
     * @param spec
     *        Lists the service instances to add and the existing service instances to remain. Omit the existing service
     *        instances to delete from the list. <i>Don't</i> include edits to the existing service instances or
     *        pipeline. For more information, see <i>Edit a service</i> in the <a
     *        href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-svc-update.html">AWS Proton Administration
     *        Guide</a> or the <a href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-update.html">AWS
     *        Proton User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withSpec(String spec) {
        setSpec(spec);
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceRequest == false)
            return false;
        UpdateServiceRequest other = (UpdateServiceRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceRequest clone() {
        return (UpdateServiceRequest) super.clone();
    }

}
