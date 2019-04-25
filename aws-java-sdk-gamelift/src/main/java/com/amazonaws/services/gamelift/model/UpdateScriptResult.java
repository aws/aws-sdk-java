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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateScript" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateScriptResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The newly created script record with a unique script ID. The new script's storage location reflects an Amazon S3
     * location: (1) If the script was uploaded from an S3 bucket under your account, the storage location reflects the
     * information that was provided in the <i>CreateScript</i> request; (2) If the script file was uploaded from a
     * local zip file, the storage location reflects an S3 location controls by the Amazon GameLift service.
     * </p>
     */
    private Script script;

    /**
     * <p>
     * The newly created script record with a unique script ID. The new script's storage location reflects an Amazon S3
     * location: (1) If the script was uploaded from an S3 bucket under your account, the storage location reflects the
     * information that was provided in the <i>CreateScript</i> request; (2) If the script file was uploaded from a
     * local zip file, the storage location reflects an S3 location controls by the Amazon GameLift service.
     * </p>
     * 
     * @param script
     *        The newly created script record with a unique script ID. The new script's storage location reflects an
     *        Amazon S3 location: (1) If the script was uploaded from an S3 bucket under your account, the storage
     *        location reflects the information that was provided in the <i>CreateScript</i> request; (2) If the script
     *        file was uploaded from a local zip file, the storage location reflects an S3 location controls by the
     *        Amazon GameLift service.
     */

    public void setScript(Script script) {
        this.script = script;
    }

    /**
     * <p>
     * The newly created script record with a unique script ID. The new script's storage location reflects an Amazon S3
     * location: (1) If the script was uploaded from an S3 bucket under your account, the storage location reflects the
     * information that was provided in the <i>CreateScript</i> request; (2) If the script file was uploaded from a
     * local zip file, the storage location reflects an S3 location controls by the Amazon GameLift service.
     * </p>
     * 
     * @return The newly created script record with a unique script ID. The new script's storage location reflects an
     *         Amazon S3 location: (1) If the script was uploaded from an S3 bucket under your account, the storage
     *         location reflects the information that was provided in the <i>CreateScript</i> request; (2) If the script
     *         file was uploaded from a local zip file, the storage location reflects an S3 location controls by the
     *         Amazon GameLift service.
     */

    public Script getScript() {
        return this.script;
    }

    /**
     * <p>
     * The newly created script record with a unique script ID. The new script's storage location reflects an Amazon S3
     * location: (1) If the script was uploaded from an S3 bucket under your account, the storage location reflects the
     * information that was provided in the <i>CreateScript</i> request; (2) If the script file was uploaded from a
     * local zip file, the storage location reflects an S3 location controls by the Amazon GameLift service.
     * </p>
     * 
     * @param script
     *        The newly created script record with a unique script ID. The new script's storage location reflects an
     *        Amazon S3 location: (1) If the script was uploaded from an S3 bucket under your account, the storage
     *        location reflects the information that was provided in the <i>CreateScript</i> request; (2) If the script
     *        file was uploaded from a local zip file, the storage location reflects an S3 location controls by the
     *        Amazon GameLift service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScriptResult withScript(Script script) {
        setScript(script);
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
        if (getScript() != null)
            sb.append("Script: ").append(getScript());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateScriptResult == false)
            return false;
        UpdateScriptResult other = (UpdateScriptResult) obj;
        if (other.getScript() == null ^ this.getScript() == null)
            return false;
        if (other.getScript() != null && other.getScript().equals(this.getScript()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScript() == null) ? 0 : getScript().hashCode());
        return hashCode;
    }

    @Override
    public UpdateScriptResult clone() {
        try {
            return (UpdateScriptResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
