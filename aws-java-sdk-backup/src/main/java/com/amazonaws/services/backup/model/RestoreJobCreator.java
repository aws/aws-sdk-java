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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the restore testing plan that Backup used to initiate the restore job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RestoreJobCreator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreJobCreator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     * </p>
     */
    private String restoreTestingPlanArn;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     * </p>
     * 
     * @param restoreTestingPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     */

    public void setRestoreTestingPlanArn(String restoreTestingPlanArn) {
        this.restoreTestingPlanArn = restoreTestingPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     */

    public String getRestoreTestingPlanArn() {
        return this.restoreTestingPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     * </p>
     * 
     * @param restoreTestingPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a restore testing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobCreator withRestoreTestingPlanArn(String restoreTestingPlanArn) {
        setRestoreTestingPlanArn(restoreTestingPlanArn);
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
        if (getRestoreTestingPlanArn() != null)
            sb.append("RestoreTestingPlanArn: ").append(getRestoreTestingPlanArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreJobCreator == false)
            return false;
        RestoreJobCreator other = (RestoreJobCreator) obj;
        if (other.getRestoreTestingPlanArn() == null ^ this.getRestoreTestingPlanArn() == null)
            return false;
        if (other.getRestoreTestingPlanArn() != null && other.getRestoreTestingPlanArn().equals(this.getRestoreTestingPlanArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestoreTestingPlanArn() == null) ? 0 : getRestoreTestingPlanArn().hashCode());
        return hashCode;
    }

    @Override
    public RestoreJobCreator clone() {
        try {
            return (RestoreJobCreator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RestoreJobCreatorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
