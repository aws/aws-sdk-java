/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p>
 * The code for the Lambda function.
 * </p>
 */
public class FunctionCode implements Serializable, Cloneable {

    /**
     * A base64-encoded .zip file containing your packaged source code. For
     * more information about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     * Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     */
    private java.nio.ByteBuffer zipFile;

    /**
     * A base64-encoded .zip file containing your packaged source code. For
     * more information about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     * Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     *
     * @return A base64-encoded .zip file containing your packaged source code. For
     *         more information about creating a .zip file, go to <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     *         Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     */
    public java.nio.ByteBuffer getZipFile() {
        return zipFile;
    }
    
    /**
     * A base64-encoded .zip file containing your packaged source code. For
     * more information about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     * Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     *
     * @param zipFile A base64-encoded .zip file containing your packaged source code. For
     *         more information about creating a .zip file, go to <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     *         Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     */
    public void setZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
    }
    
    /**
     * A base64-encoded .zip file containing your packaged source code. For
     * more information about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     * Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param zipFile A base64-encoded .zip file containing your packaged source code. For
     *         more information about creating a .zip file, go to <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     *         Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FunctionCode withZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getZipFile() != null) sb.append("ZipFile: " + getZipFile() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getZipFile() == null) ? 0 : getZipFile().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof FunctionCode == false) return false;
        FunctionCode other = (FunctionCode)obj;
        
        if (other.getZipFile() == null ^ this.getZipFile() == null) return false;
        if (other.getZipFile() != null && other.getZipFile().equals(this.getZipFile()) == false) return false; 
        return true;
    }
    
    @Override
    public FunctionCode clone() {
        try {
            return (FunctionCode) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    