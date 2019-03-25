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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateQueue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateQueueResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * You can use queues to manage the resources that are available to your AWS account for running multiple
     * transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default
     * queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
     */
    private Queue queue;

    /**
     * You can use queues to manage the resources that are available to your AWS account for running multiple
     * transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default
     * queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
     * 
     * @param queue
     *        You can use queues to manage the resources that are available to your AWS account for running multiple
     *        transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the
     *        default queue. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
     */

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    /**
     * You can use queues to manage the resources that are available to your AWS account for running multiple
     * transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default
     * queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
     * 
     * @return You can use queues to manage the resources that are available to your AWS account for running multiple
     *         transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the
     *         default queue. For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
     */

    public Queue getQueue() {
        return this.queue;
    }

    /**
     * You can use queues to manage the resources that are available to your AWS account for running multiple
     * transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default
     * queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
     * 
     * @param queue
     *        You can use queues to manage the resources that are available to your AWS account for running multiple
     *        transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the
     *        default queue. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueResult withQueue(Queue queue) {
        setQueue(queue);
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
        if (getQueue() != null)
            sb.append("Queue: ").append(getQueue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQueueResult == false)
            return false;
        CreateQueueResult other = (CreateQueueResult) obj;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        return hashCode;
    }

    @Override
    public CreateQueueResult clone() {
        try {
            return (CreateQueueResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
