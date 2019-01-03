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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the state of the bitstream generation process for an Amazon FPGA image (AFI).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FpgaImageState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FpgaImageState implements Serializable, Cloneable {

    /**
     * <p>
     * The state. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - AFI bitstream generation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code> - The AFI is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - AFI bitstream generation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unavailable</code> - The AFI is no longer available for use.
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * If the state is <code>failed</code>, this is the error message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The state. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - AFI bitstream generation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code> - The AFI is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - AFI bitstream generation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unavailable</code> - The AFI is no longer available for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The state. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code> - AFI bitstream generation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code> - The AFI is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - AFI bitstream generation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unavailable</code> - The AFI is no longer available for use.
     *        </p>
     *        </li>
     * @see FpgaImageStateCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The state. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - AFI bitstream generation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code> - The AFI is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - AFI bitstream generation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unavailable</code> - The AFI is no longer available for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>pending</code> - AFI bitstream generation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code> - The AFI is available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code> - AFI bitstream generation failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unavailable</code> - The AFI is no longer available for use.
     *         </p>
     *         </li>
     * @see FpgaImageStateCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The state. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - AFI bitstream generation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code> - The AFI is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - AFI bitstream generation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unavailable</code> - The AFI is no longer available for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The state. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code> - AFI bitstream generation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code> - The AFI is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - AFI bitstream generation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unavailable</code> - The AFI is no longer available for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FpgaImageStateCode
     */

    public FpgaImageState withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The state. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - AFI bitstream generation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code> - The AFI is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - AFI bitstream generation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unavailable</code> - The AFI is no longer available for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The state. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code> - AFI bitstream generation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code> - The AFI is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - AFI bitstream generation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unavailable</code> - The AFI is no longer available for use.
     *        </p>
     *        </li>
     * @see FpgaImageStateCode
     */

    public void setCode(FpgaImageStateCode code) {
        withCode(code);
    }

    /**
     * <p>
     * The state. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code> - AFI bitstream generation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code> - The AFI is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - AFI bitstream generation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unavailable</code> - The AFI is no longer available for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The state. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code> - AFI bitstream generation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code> - The AFI is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - AFI bitstream generation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unavailable</code> - The AFI is no longer available for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FpgaImageStateCode
     */

    public FpgaImageState withCode(FpgaImageStateCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * If the state is <code>failed</code>, this is the error message.
     * </p>
     * 
     * @param message
     *        If the state is <code>failed</code>, this is the error message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If the state is <code>failed</code>, this is the error message.
     * </p>
     * 
     * @return If the state is <code>failed</code>, this is the error message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * If the state is <code>failed</code>, this is the error message.
     * </p>
     * 
     * @param message
     *        If the state is <code>failed</code>, this is the error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImageState withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FpgaImageState == false)
            return false;
        FpgaImageState other = (FpgaImageState) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public FpgaImageState clone() {
        try {
            return (FpgaImageState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
