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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBInstanceAutomatedBackupsReplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopDBInstanceAutomatedBackupsReplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance for which to stop replicating automated backups, for
     * example, <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     * </p>
     */
    private String sourceDBInstanceArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance for which to stop replicating automated backups, for
     * example, <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     * </p>
     * 
     * @param sourceDBInstanceArn
     *        The Amazon Resource Name (ARN) of the source DB instance for which to stop replicating automated backups,
     *        for example, <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     */

    public void setSourceDBInstanceArn(String sourceDBInstanceArn) {
        this.sourceDBInstanceArn = sourceDBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance for which to stop replicating automated backups, for
     * example, <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source DB instance for which to stop replicating automated backups,
     *         for example, <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     */

    public String getSourceDBInstanceArn() {
        return this.sourceDBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance for which to stop replicating automated backups, for
     * example, <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     * </p>
     * 
     * @param sourceDBInstanceArn
     *        The Amazon Resource Name (ARN) of the source DB instance for which to stop replicating automated backups,
     *        for example, <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDBInstanceAutomatedBackupsReplicationRequest withSourceDBInstanceArn(String sourceDBInstanceArn) {
        setSourceDBInstanceArn(sourceDBInstanceArn);
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
        if (getSourceDBInstanceArn() != null)
            sb.append("SourceDBInstanceArn: ").append(getSourceDBInstanceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDBInstanceAutomatedBackupsReplicationRequest == false)
            return false;
        StopDBInstanceAutomatedBackupsReplicationRequest other = (StopDBInstanceAutomatedBackupsReplicationRequest) obj;
        if (other.getSourceDBInstanceArn() == null ^ this.getSourceDBInstanceArn() == null)
            return false;
        if (other.getSourceDBInstanceArn() != null && other.getSourceDBInstanceArn().equals(this.getSourceDBInstanceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceDBInstanceArn() == null) ? 0 : getSourceDBInstanceArn().hashCode());
        return hashCode;
    }

    @Override
    public StopDBInstanceAutomatedBackupsReplicationRequest clone() {
        return (StopDBInstanceAutomatedBackupsReplicationRequest) super.clone();
    }

}
