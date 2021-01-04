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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationTaskAssessmentRun"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReplicationTaskAssessmentRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the premigration assessment run to be deleted.
     * </p>
     */
    private String replicationTaskAssessmentRunArn;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the premigration assessment run to be deleted.
     * </p>
     * 
     * @param replicationTaskAssessmentRunArn
     *        Amazon Resource Name (ARN) of the premigration assessment run to be deleted.
     */

    public void setReplicationTaskAssessmentRunArn(String replicationTaskAssessmentRunArn) {
        this.replicationTaskAssessmentRunArn = replicationTaskAssessmentRunArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the premigration assessment run to be deleted.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the premigration assessment run to be deleted.
     */

    public String getReplicationTaskAssessmentRunArn() {
        return this.replicationTaskAssessmentRunArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the premigration assessment run to be deleted.
     * </p>
     * 
     * @param replicationTaskAssessmentRunArn
     *        Amazon Resource Name (ARN) of the premigration assessment run to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReplicationTaskAssessmentRunRequest withReplicationTaskAssessmentRunArn(String replicationTaskAssessmentRunArn) {
        setReplicationTaskAssessmentRunArn(replicationTaskAssessmentRunArn);
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
        if (getReplicationTaskAssessmentRunArn() != null)
            sb.append("ReplicationTaskAssessmentRunArn: ").append(getReplicationTaskAssessmentRunArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReplicationTaskAssessmentRunRequest == false)
            return false;
        DeleteReplicationTaskAssessmentRunRequest other = (DeleteReplicationTaskAssessmentRunRequest) obj;
        if (other.getReplicationTaskAssessmentRunArn() == null ^ this.getReplicationTaskAssessmentRunArn() == null)
            return false;
        if (other.getReplicationTaskAssessmentRunArn() != null
                && other.getReplicationTaskAssessmentRunArn().equals(this.getReplicationTaskAssessmentRunArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTaskAssessmentRunArn() == null) ? 0 : getReplicationTaskAssessmentRunArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteReplicationTaskAssessmentRunRequest clone() {
        return (DeleteReplicationTaskAssessmentRunRequest) super.clone();
    }

}
