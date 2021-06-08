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

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationTaskAssessmentRun"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReplicationTaskAssessmentRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The <code>ReplicationTaskAssessmentRun</code> object for the deleted assessment run.
     * </p>
     */
    private ReplicationTaskAssessmentRun replicationTaskAssessmentRun;

    /**
     * <p>
     * The <code>ReplicationTaskAssessmentRun</code> object for the deleted assessment run.
     * </p>
     * 
     * @param replicationTaskAssessmentRun
     *        The <code>ReplicationTaskAssessmentRun</code> object for the deleted assessment run.
     */

    public void setReplicationTaskAssessmentRun(ReplicationTaskAssessmentRun replicationTaskAssessmentRun) {
        this.replicationTaskAssessmentRun = replicationTaskAssessmentRun;
    }

    /**
     * <p>
     * The <code>ReplicationTaskAssessmentRun</code> object for the deleted assessment run.
     * </p>
     * 
     * @return The <code>ReplicationTaskAssessmentRun</code> object for the deleted assessment run.
     */

    public ReplicationTaskAssessmentRun getReplicationTaskAssessmentRun() {
        return this.replicationTaskAssessmentRun;
    }

    /**
     * <p>
     * The <code>ReplicationTaskAssessmentRun</code> object for the deleted assessment run.
     * </p>
     * 
     * @param replicationTaskAssessmentRun
     *        The <code>ReplicationTaskAssessmentRun</code> object for the deleted assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReplicationTaskAssessmentRunResult withReplicationTaskAssessmentRun(ReplicationTaskAssessmentRun replicationTaskAssessmentRun) {
        setReplicationTaskAssessmentRun(replicationTaskAssessmentRun);
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
        if (getReplicationTaskAssessmentRun() != null)
            sb.append("ReplicationTaskAssessmentRun: ").append(getReplicationTaskAssessmentRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReplicationTaskAssessmentRunResult == false)
            return false;
        DeleteReplicationTaskAssessmentRunResult other = (DeleteReplicationTaskAssessmentRunResult) obj;
        if (other.getReplicationTaskAssessmentRun() == null ^ this.getReplicationTaskAssessmentRun() == null)
            return false;
        if (other.getReplicationTaskAssessmentRun() != null && other.getReplicationTaskAssessmentRun().equals(this.getReplicationTaskAssessmentRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTaskAssessmentRun() == null) ? 0 : getReplicationTaskAssessmentRun().hashCode());
        return hashCode;
    }

    @Override
    public DeleteReplicationTaskAssessmentRunResult clone() {
        try {
            return (DeleteReplicationTaskAssessmentRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
