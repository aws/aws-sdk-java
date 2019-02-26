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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ReceiveMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReceiveMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The URL of the Amazon SQS queue from which messages are received.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueUrl;
    /**
     * <p>
     * A list of s that need to be returned along with each message. These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - Returns the time the message was first received from the queue
     * (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - Returns the number of times a message has been received from the queue but
     * not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an IAM user, returns the IAM user ID, for example <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an IAM role, returns the IAM role ID, for example <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - Returns the time the message was sent to the queue (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code> - Returns the value provided by the producer that calls the
     * <code> <a>SendMessage</a> </code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code> - Returns the value provided by the producer that calls the
     * <code> <a>SendMessage</a> </code> action. Messages with the same <code>MessageGroupId</code> are returned in
     * sequence.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code> - Returns the value provided by Amazon SQS.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> attributeNames;
    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can contain alphanumeric characters and the underscore (<code>_</code>), hyphen (<code>-</code>), and
     * period (<code>.</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name is case-sensitive and must be unique among all attribute names for the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start with AWS-reserved prefixes such as <code>AWS.</code> or <code>Amazon.</code> (or any
     * casing variants).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start or end with a period (<code>.</code>), and it should not have periods in succession (
     * <code>..</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name can be up to 256 characters long.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can return all
     * of the attributes by specifying <code>All</code> or <code>.*</code> in your request. You can also use all message
     * attributes starting with a prefix, for example <code>bar.*</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> messageAttributeNames;
    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more messages than this value (however, fewer
     * messages might be returned). Valid values: 1 to 10. Default: 1.
     * </p>
     */
    private Integer maxNumberOfMessages;
    /**
     * <p>
     * The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after being
     * retrieved by a <code>ReceiveMessage</code> request.
     * </p>
     */
    private Integer visibilityTimeout;
    /**
     * <p>
     * The duration (in seconds) for which the call waits for a message to arrive in the queue before returning. If a
     * message is available, the call returns sooner than <code>WaitTimeSeconds</code>. If no messages are available and
     * the wait time expires, the call returns successfully with an empty list of messages.
     * </p>
     */
    private Integer waitTimeSeconds;
    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of <code>ReceiveMessage</code> calls. If a networking issue occurs after a
     * <code>ReceiveMessage</code> action, and instead of a response you receive a generic error, you can retry the same
     * action with an identical <code>ReceiveRequestAttemptId</code> to retrieve the same set of messages, even if their
     * visibility timeout has not yet expired.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use <code>ReceiveRequestAttemptId</code> only for 5 minutes after a <code>ReceiveMessage</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>FifoQueue</code>, a caller of the <code>ReceiveMessage</code> action can provide a
     * <code>ReceiveRequestAttemptId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action doesn't provide a <code>ReceiveRequestAttemptId</code>,
     * Amazon SQS generates a <code>ReceiveRequestAttemptId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can retry the <code>ReceiveMessage</code> action with the same <code>ReceiveRequestAttemptId</code> if none
     * of the messages have been modified (deleted or had their visibility changes).
     * </p>
     * </li>
     * <li>
     * <p>
     * During a visibility timeout, subsequent calls with the same <code>ReceiveRequestAttemptId</code> return the same
     * messages and receipt handles. If a retry occurs within the deduplication interval, it resets the visibility
     * timeout. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action still processes messages when the visibility timeout
     * expires and messages become visible, another worker consuming from the same queue can receive the same messages
     * and therefore process duplicates. Also, if a consumer whose message processing time is longer than the visibility
     * timeout tries to delete the processed messages, the action fails with an error.
     * </p>
     * <p>
     * To mitigate this effect, ensure that your application observes a safe threshold before the visibility timeout
     * expires and extend the visibility timeout as necessary.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * While messages with a particular <code>MessageGroupId</code> are invisible, no more messages belonging to the
     * same <code>MessageGroupId</code> are returned until the visibility timeout expires. You can still receive
     * messages with another <code>MessageGroupId</code> as long as it is also visible.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of <code>ReceiveMessage</code> can't track the <code>ReceiveRequestAttemptId</code>, no retries work
     * until the original visibility timeout expires. As a result, delays might occur but the messages in the queue
     * remain in a strict order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length of <code>ReceiveRequestAttemptId</code> is 128 characters. <code>ReceiveRequestAttemptId</code> can
     * contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (
     * <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>ReceiveRequestAttemptId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     * >Using the ReceiveRequestAttemptId Request Parameter</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     */
    private String receiveRequestAttemptId;

    /**
     * Default constructor for ReceiveMessageRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ReceiveMessageRequest() {
    }

    /**
     * Constructs a new ReceiveMessageRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue from which messages are received.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */
    public ReceiveMessageRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue from which messages are received.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue from which messages are received.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */

    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue from which messages are received.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @return The URL of the Amazon SQS queue from which messages are received.</p>
     *         <p>
     *         Queue URLs and names are case-sensitive.
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue from which messages are received.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue from which messages are received.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiveMessageRequest withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * A list of s that need to be returned along with each message. These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - Returns the time the message was first received from the queue
     * (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - Returns the number of times a message has been received from the queue but
     * not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an IAM user, returns the IAM user ID, for example <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an IAM role, returns the IAM role ID, for example <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - Returns the time the message was sent to the queue (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code> - Returns the value provided by the producer that calls the
     * <code> <a>SendMessage</a> </code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code> - Returns the value provided by the producer that calls the
     * <code> <a>SendMessage</a> </code> action. Messages with the same <code>MessageGroupId</code> are returned in
     * sequence.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code> - Returns the value provided by Amazon SQS.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of s that need to be returned along with each message. These attributes include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>All</code> - Returns all values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateFirstReceiveTimestamp</code> - Returns the time the message was first received from the
     *         queue (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateReceiveCount</code> - Returns the number of times a message has been received from the
     *         queue but not deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SenderId</code>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For an IAM user, returns the IAM user ID, for example <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an IAM role, returns the IAM role ID, for example <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SentTimestamp</code> - Returns the time the message was sent to the queue (<a
     *         href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageDeduplicationId</code> - Returns the value provided by the producer that calls the
     *         <code> <a>SendMessage</a> </code> action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageGroupId</code> - Returns the value provided by the producer that calls the
     *         <code> <a>SendMessage</a> </code> action. Messages with the same <code>MessageGroupId</code> are returned
     *         in sequence.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SequenceNumber</code> - Returns the value provided by Amazon SQS.
     *         </p>
     *         </li>
     * @see QueueAttributeName
     */

    public java.util.List<String> getAttributeNames() {
        if (attributeNames == null) {
            attributeNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return attributeNames;
    }

    /**
     * <p>
     * A list of s that need to be returned along with each message. These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - Returns the time the message was first received from the queue
     * (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - Returns the number of times a message has been received from the queue but
     * not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an IAM user, returns the IAM user ID, for example <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an IAM role, returns the IAM role ID, for example <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - Returns the time the message was sent to the queue (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code> - Returns the value provided by the producer that calls the
     * <code> <a>SendMessage</a> </code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code> - Returns the value provided by the producer that calls the
     * <code> <a>SendMessage</a> </code> action. Messages with the same <code>MessageGroupId</code> are returned in
     * sequence.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code> - Returns the value provided by Amazon SQS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributeNames
     *        A list of s that need to be returned along with each message. These attributes include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>All</code> - Returns all values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateFirstReceiveTimestamp</code> - Returns the time the message was first received from the
     *        queue (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateReceiveCount</code> - Returns the number of times a message has been received from the
     *        queue but not deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SenderId</code>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an IAM user, returns the IAM user ID, for example <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an IAM role, returns the IAM role ID, for example <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SentTimestamp</code> - Returns the time the message was sent to the queue (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageDeduplicationId</code> - Returns the value provided by the producer that calls the
     *        <code> <a>SendMessage</a> </code> action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageGroupId</code> - Returns the value provided by the producer that calls the
     *        <code> <a>SendMessage</a> </code> action. Messages with the same <code>MessageGroupId</code> are returned
     *        in sequence.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SequenceNumber</code> - Returns the value provided by Amazon SQS.
     *        </p>
     *        </li>
     * @see QueueAttributeName
     */

    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new com.amazonaws.internal.SdkInternalList<String>(attributeNames);
    }

    /**
     * <p>
     * A list of s that need to be returned along with each message. These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - Returns the time the message was first received from the queue
     * (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - Returns the number of times a message has been received from the queue but
     * not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an IAM user, returns the IAM user ID, for example <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an IAM role, returns the IAM role ID, for example <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - Returns the time the message was sent to the queue (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code> - Returns the value provided by the producer that calls the
     * <code> <a>SendMessage</a> </code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code> - Returns the value provided by the producer that calls the
     * <code> <a>SendMessage</a> </code> action. Messages with the same <code>MessageGroupId</code> are returned in
     * sequence.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code> - Returns the value provided by Amazon SQS.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeNames(java.util.Collection)} or {@link #withAttributeNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeNames
     *        A list of s that need to be returned along with each message. These attributes include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>All</code> - Returns all values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateFirstReceiveTimestamp</code> - Returns the time the message was first received from the
     *        queue (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateReceiveCount</code> - Returns the number of times a message has been received from the
     *        queue but not deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SenderId</code>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an IAM user, returns the IAM user ID, for example <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an IAM role, returns the IAM role ID, for example <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SentTimestamp</code> - Returns the time the message was sent to the queue (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageDeduplicationId</code> - Returns the value provided by the producer that calls the
     *        <code> <a>SendMessage</a> </code> action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageGroupId</code> - Returns the value provided by the producer that calls the
     *        <code> <a>SendMessage</a> </code> action. Messages with the same <code>MessageGroupId</code> are returned
     *        in sequence.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SequenceNumber</code> - Returns the value provided by Amazon SQS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueAttributeName
     */

    public ReceiveMessageRequest withAttributeNames(String... attributeNames) {
        if (this.attributeNames == null) {
            setAttributeNames(new com.amazonaws.internal.SdkInternalList<String>(attributeNames.length));
        }
        for (String ele : attributeNames) {
            this.attributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of s that need to be returned along with each message. These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - Returns the time the message was first received from the queue
     * (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - Returns the number of times a message has been received from the queue but
     * not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an IAM user, returns the IAM user ID, for example <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an IAM role, returns the IAM role ID, for example <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - Returns the time the message was sent to the queue (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code> - Returns the value provided by the producer that calls the
     * <code> <a>SendMessage</a> </code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code> - Returns the value provided by the producer that calls the
     * <code> <a>SendMessage</a> </code> action. Messages with the same <code>MessageGroupId</code> are returned in
     * sequence.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code> - Returns the value provided by Amazon SQS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributeNames
     *        A list of s that need to be returned along with each message. These attributes include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>All</code> - Returns all values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateFirstReceiveTimestamp</code> - Returns the time the message was first received from the
     *        queue (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateReceiveCount</code> - Returns the number of times a message has been received from the
     *        queue but not deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SenderId</code>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an IAM user, returns the IAM user ID, for example <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an IAM role, returns the IAM role ID, for example <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SentTimestamp</code> - Returns the time the message was sent to the queue (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageDeduplicationId</code> - Returns the value provided by the producer that calls the
     *        <code> <a>SendMessage</a> </code> action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageGroupId</code> - Returns the value provided by the producer that calls the
     *        <code> <a>SendMessage</a> </code> action. Messages with the same <code>MessageGroupId</code> are returned
     *        in sequence.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SequenceNumber</code> - Returns the value provided by Amazon SQS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueAttributeName
     */

    public ReceiveMessageRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
        return this;
    }

    /**
     * <p>
     * A list of s that need to be returned along with each message. These attributes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>All</code> - Returns all values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> - Returns the time the message was first received from the queue
     * (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code> - Returns the number of times a message has been received from the queue but
     * not deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an IAM user, returns the IAM user ID, for example <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an IAM role, returns the IAM role ID, for example <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code> - Returns the time the message was sent to the queue (<a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code> - Returns the value provided by the producer that calls the
     * <code> <a>SendMessage</a> </code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code> - Returns the value provided by the producer that calls the
     * <code> <a>SendMessage</a> </code> action. Messages with the same <code>MessageGroupId</code> are returned in
     * sequence.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code> - Returns the value provided by Amazon SQS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributeNames
     *        A list of s that need to be returned along with each message. These attributes include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>All</code> - Returns all values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateFirstReceiveTimestamp</code> - Returns the time the message was first received from the
     *        queue (<a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateReceiveCount</code> - Returns the number of times a message has been received from the
     *        queue but not deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SenderId</code>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an IAM user, returns the IAM user ID, for example <code>ABCDEFGHI1JKLMNOPQ23R</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an IAM role, returns the IAM role ID, for example <code>ABCDE1F2GH3I4JK5LMNOP:i-a123b456</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SentTimestamp</code> - Returns the time the message was sent to the queue (<a
     *        href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageDeduplicationId</code> - Returns the value provided by the producer that calls the
     *        <code> <a>SendMessage</a> </code> action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageGroupId</code> - Returns the value provided by the producer that calls the
     *        <code> <a>SendMessage</a> </code> action. Messages with the same <code>MessageGroupId</code> are returned
     *        in sequence.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SequenceNumber</code> - Returns the value provided by Amazon SQS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueAttributeName
     */

    public ReceiveMessageRequest withAttributeNames(QueueAttributeName... attributeNames) {
        com.amazonaws.internal.SdkInternalList<String> attributeNamesCopy = new com.amazonaws.internal.SdkInternalList<String>(attributeNames.length);
        for (QueueAttributeName value : attributeNames) {
            attributeNamesCopy.add(value.toString());
        }
        if (getAttributeNames() == null) {
            setAttributeNames(attributeNamesCopy);
        } else {
            getAttributeNames().addAll(attributeNamesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can contain alphanumeric characters and the underscore (<code>_</code>), hyphen (<code>-</code>), and
     * period (<code>.</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name is case-sensitive and must be unique among all attribute names for the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start with AWS-reserved prefixes such as <code>AWS.</code> or <code>Amazon.</code> (or any
     * casing variants).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start or end with a period (<code>.</code>), and it should not have periods in succession (
     * <code>..</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name can be up to 256 characters long.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can return all
     * of the attributes by specifying <code>All</code> or <code>.*</code> in your request. You can also use all message
     * attributes starting with a prefix, for example <code>bar.*</code>.
     * </p>
     * 
     * @return The name of the message attribute, where <i>N</i> is the index.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The name can contain alphanumeric characters and the underscore (<code>_</code>), hyphen (<code>-</code>
     *         ), and period (<code>.</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name is case-sensitive and must be unique among all attribute names for the message.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name must not start with AWS-reserved prefixes such as <code>AWS.</code> or <code>Amazon.</code> (or
     *         any casing variants).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name must not start or end with a period (<code>.</code>), and it should not have periods in
     *         succession (<code>..</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name can be up to 256 characters long.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can
     *         return all of the attributes by specifying <code>All</code> or <code>.*</code> in your request. You can
     *         also use all message attributes starting with a prefix, for example <code>bar.*</code>.
     */

    public java.util.List<String> getMessageAttributeNames() {
        if (messageAttributeNames == null) {
            messageAttributeNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return messageAttributeNames;
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can contain alphanumeric characters and the underscore (<code>_</code>), hyphen (<code>-</code>), and
     * period (<code>.</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name is case-sensitive and must be unique among all attribute names for the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start with AWS-reserved prefixes such as <code>AWS.</code> or <code>Amazon.</code> (or any
     * casing variants).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start or end with a period (<code>.</code>), and it should not have periods in succession (
     * <code>..</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name can be up to 256 characters long.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can return all
     * of the attributes by specifying <code>All</code> or <code>.*</code> in your request. You can also use all message
     * attributes starting with a prefix, for example <code>bar.*</code>.
     * </p>
     * 
     * @param messageAttributeNames
     *        The name of the message attribute, where <i>N</i> is the index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The name can contain alphanumeric characters and the underscore (<code>_</code>), hyphen (<code>-</code>),
     *        and period (<code>.</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name is case-sensitive and must be unique among all attribute names for the message.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name must not start with AWS-reserved prefixes such as <code>AWS.</code> or <code>Amazon.</code> (or
     *        any casing variants).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name must not start or end with a period (<code>.</code>), and it should not have periods in
     *        succession (<code>..</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name can be up to 256 characters long.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can
     *        return all of the attributes by specifying <code>All</code> or <code>.*</code> in your request. You can
     *        also use all message attributes starting with a prefix, for example <code>bar.*</code>.
     */

    public void setMessageAttributeNames(java.util.Collection<String> messageAttributeNames) {
        if (messageAttributeNames == null) {
            this.messageAttributeNames = null;
            return;
        }

        this.messageAttributeNames = new com.amazonaws.internal.SdkInternalList<String>(messageAttributeNames);
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can contain alphanumeric characters and the underscore (<code>_</code>), hyphen (<code>-</code>), and
     * period (<code>.</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name is case-sensitive and must be unique among all attribute names for the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start with AWS-reserved prefixes such as <code>AWS.</code> or <code>Amazon.</code> (or any
     * casing variants).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start or end with a period (<code>.</code>), and it should not have periods in succession (
     * <code>..</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name can be up to 256 characters long.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can return all
     * of the attributes by specifying <code>All</code> or <code>.*</code> in your request. You can also use all message
     * attributes starting with a prefix, for example <code>bar.*</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessageAttributeNames(java.util.Collection)} or
     * {@link #withMessageAttributeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param messageAttributeNames
     *        The name of the message attribute, where <i>N</i> is the index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The name can contain alphanumeric characters and the underscore (<code>_</code>), hyphen (<code>-</code>),
     *        and period (<code>.</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name is case-sensitive and must be unique among all attribute names for the message.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name must not start with AWS-reserved prefixes such as <code>AWS.</code> or <code>Amazon.</code> (or
     *        any casing variants).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name must not start or end with a period (<code>.</code>), and it should not have periods in
     *        succession (<code>..</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name can be up to 256 characters long.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can
     *        return all of the attributes by specifying <code>All</code> or <code>.*</code> in your request. You can
     *        also use all message attributes starting with a prefix, for example <code>bar.*</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiveMessageRequest withMessageAttributeNames(String... messageAttributeNames) {
        if (this.messageAttributeNames == null) {
            setMessageAttributeNames(new com.amazonaws.internal.SdkInternalList<String>(messageAttributeNames.length));
        }
        for (String ele : messageAttributeNames) {
            this.messageAttributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the message attribute, where <i>N</i> is the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name can contain alphanumeric characters and the underscore (<code>_</code>), hyphen (<code>-</code>), and
     * period (<code>.</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name is case-sensitive and must be unique among all attribute names for the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start with AWS-reserved prefixes such as <code>AWS.</code> or <code>Amazon.</code> (or any
     * casing variants).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name must not start or end with a period (<code>.</code>), and it should not have periods in succession (
     * <code>..</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The name can be up to 256 characters long.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can return all
     * of the attributes by specifying <code>All</code> or <code>.*</code> in your request. You can also use all message
     * attributes starting with a prefix, for example <code>bar.*</code>.
     * </p>
     * 
     * @param messageAttributeNames
     *        The name of the message attribute, where <i>N</i> is the index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The name can contain alphanumeric characters and the underscore (<code>_</code>), hyphen (<code>-</code>),
     *        and period (<code>.</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name is case-sensitive and must be unique among all attribute names for the message.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name must not start with AWS-reserved prefixes such as <code>AWS.</code> or <code>Amazon.</code> (or
     *        any casing variants).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name must not start or end with a period (<code>.</code>), and it should not have periods in
     *        succession (<code>..</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name can be up to 256 characters long.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When using <code>ReceiveMessage</code>, you can send a list of attribute names to receive, or you can
     *        return all of the attributes by specifying <code>All</code> or <code>.*</code> in your request. You can
     *        also use all message attributes starting with a prefix, for example <code>bar.*</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiveMessageRequest withMessageAttributeNames(java.util.Collection<String> messageAttributeNames) {
        setMessageAttributeNames(messageAttributeNames);
        return this;
    }

    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more messages than this value (however, fewer
     * messages might be returned). Valid values: 1 to 10. Default: 1.
     * </p>
     * 
     * @param maxNumberOfMessages
     *        The maximum number of messages to return. Amazon SQS never returns more messages than this value (however,
     *        fewer messages might be returned). Valid values: 1 to 10. Default: 1.
     */

    public void setMaxNumberOfMessages(Integer maxNumberOfMessages) {
        this.maxNumberOfMessages = maxNumberOfMessages;
    }

    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more messages than this value (however, fewer
     * messages might be returned). Valid values: 1 to 10. Default: 1.
     * </p>
     * 
     * @return The maximum number of messages to return. Amazon SQS never returns more messages than this value
     *         (however, fewer messages might be returned). Valid values: 1 to 10. Default: 1.
     */

    public Integer getMaxNumberOfMessages() {
        return this.maxNumberOfMessages;
    }

    /**
     * <p>
     * The maximum number of messages to return. Amazon SQS never returns more messages than this value (however, fewer
     * messages might be returned). Valid values: 1 to 10. Default: 1.
     * </p>
     * 
     * @param maxNumberOfMessages
     *        The maximum number of messages to return. Amazon SQS never returns more messages than this value (however,
     *        fewer messages might be returned). Valid values: 1 to 10. Default: 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiveMessageRequest withMaxNumberOfMessages(Integer maxNumberOfMessages) {
        setMaxNumberOfMessages(maxNumberOfMessages);
        return this;
    }

    /**
     * <p>
     * The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after being
     * retrieved by a <code>ReceiveMessage</code> request.
     * </p>
     * 
     * @param visibilityTimeout
     *        The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after
     *        being retrieved by a <code>ReceiveMessage</code> request.
     */

    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }

    /**
     * <p>
     * The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after being
     * retrieved by a <code>ReceiveMessage</code> request.
     * </p>
     * 
     * @return The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after
     *         being retrieved by a <code>ReceiveMessage</code> request.
     */

    public Integer getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

    /**
     * <p>
     * The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after being
     * retrieved by a <code>ReceiveMessage</code> request.
     * </p>
     * 
     * @param visibilityTimeout
     *        The duration (in seconds) that the received messages are hidden from subsequent retrieve requests after
     *        being retrieved by a <code>ReceiveMessage</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiveMessageRequest withVisibilityTimeout(Integer visibilityTimeout) {
        setVisibilityTimeout(visibilityTimeout);
        return this;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call waits for a message to arrive in the queue before returning. If a
     * message is available, the call returns sooner than <code>WaitTimeSeconds</code>. If no messages are available and
     * the wait time expires, the call returns successfully with an empty list of messages.
     * </p>
     * 
     * @param waitTimeSeconds
     *        The duration (in seconds) for which the call waits for a message to arrive in the queue before returning.
     *        If a message is available, the call returns sooner than <code>WaitTimeSeconds</code>. If no messages are
     *        available and the wait time expires, the call returns successfully with an empty list of messages.
     */

    public void setWaitTimeSeconds(Integer waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call waits for a message to arrive in the queue before returning. If a
     * message is available, the call returns sooner than <code>WaitTimeSeconds</code>. If no messages are available and
     * the wait time expires, the call returns successfully with an empty list of messages.
     * </p>
     * 
     * @return The duration (in seconds) for which the call waits for a message to arrive in the queue before returning.
     *         If a message is available, the call returns sooner than <code>WaitTimeSeconds</code>. If no messages are
     *         available and the wait time expires, the call returns successfully with an empty list of messages.
     */

    public Integer getWaitTimeSeconds() {
        return this.waitTimeSeconds;
    }

    /**
     * <p>
     * The duration (in seconds) for which the call waits for a message to arrive in the queue before returning. If a
     * message is available, the call returns sooner than <code>WaitTimeSeconds</code>. If no messages are available and
     * the wait time expires, the call returns successfully with an empty list of messages.
     * </p>
     * 
     * @param waitTimeSeconds
     *        The duration (in seconds) for which the call waits for a message to arrive in the queue before returning.
     *        If a message is available, the call returns sooner than <code>WaitTimeSeconds</code>. If no messages are
     *        available and the wait time expires, the call returns successfully with an empty list of messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiveMessageRequest withWaitTimeSeconds(Integer waitTimeSeconds) {
        setWaitTimeSeconds(waitTimeSeconds);
        return this;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of <code>ReceiveMessage</code> calls. If a networking issue occurs after a
     * <code>ReceiveMessage</code> action, and instead of a response you receive a generic error, you can retry the same
     * action with an identical <code>ReceiveRequestAttemptId</code> to retrieve the same set of messages, even if their
     * visibility timeout has not yet expired.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use <code>ReceiveRequestAttemptId</code> only for 5 minutes after a <code>ReceiveMessage</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>FifoQueue</code>, a caller of the <code>ReceiveMessage</code> action can provide a
     * <code>ReceiveRequestAttemptId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action doesn't provide a <code>ReceiveRequestAttemptId</code>,
     * Amazon SQS generates a <code>ReceiveRequestAttemptId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can retry the <code>ReceiveMessage</code> action with the same <code>ReceiveRequestAttemptId</code> if none
     * of the messages have been modified (deleted or had their visibility changes).
     * </p>
     * </li>
     * <li>
     * <p>
     * During a visibility timeout, subsequent calls with the same <code>ReceiveRequestAttemptId</code> return the same
     * messages and receipt handles. If a retry occurs within the deduplication interval, it resets the visibility
     * timeout. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action still processes messages when the visibility timeout
     * expires and messages become visible, another worker consuming from the same queue can receive the same messages
     * and therefore process duplicates. Also, if a consumer whose message processing time is longer than the visibility
     * timeout tries to delete the processed messages, the action fails with an error.
     * </p>
     * <p>
     * To mitigate this effect, ensure that your application observes a safe threshold before the visibility timeout
     * expires and extend the visibility timeout as necessary.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * While messages with a particular <code>MessageGroupId</code> are invisible, no more messages belonging to the
     * same <code>MessageGroupId</code> are returned until the visibility timeout expires. You can still receive
     * messages with another <code>MessageGroupId</code> as long as it is also visible.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of <code>ReceiveMessage</code> can't track the <code>ReceiveRequestAttemptId</code>, no retries work
     * until the original visibility timeout expires. As a result, delays might occur but the messages in the queue
     * remain in a strict order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length of <code>ReceiveRequestAttemptId</code> is 128 characters. <code>ReceiveRequestAttemptId</code> can
     * contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (
     * <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>ReceiveRequestAttemptId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     * >Using the ReceiveRequestAttemptId Request Parameter</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param receiveRequestAttemptId
     *        This parameter applies only to FIFO (first-in-first-out) queues.</p>
     *        <p>
     *        The token used for deduplication of <code>ReceiveMessage</code> calls. If a networking issue occurs after
     *        a <code>ReceiveMessage</code> action, and instead of a response you receive a generic error, you can retry
     *        the same action with an identical <code>ReceiveRequestAttemptId</code> to retrieve the same set of
     *        messages, even if their visibility timeout has not yet expired.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can use <code>ReceiveRequestAttemptId</code> only for 5 minutes after a <code>ReceiveMessage</code>
     *        action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you set <code>FifoQueue</code>, a caller of the <code>ReceiveMessage</code> action can provide a
     *        <code>ReceiveRequestAttemptId</code> explicitly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a caller of the <code>ReceiveMessage</code> action doesn't provide a
     *        <code>ReceiveRequestAttemptId</code>, Amazon SQS generates a <code>ReceiveRequestAttemptId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can retry the <code>ReceiveMessage</code> action with the same <code>ReceiveRequestAttemptId</code> if
     *        none of the messages have been modified (deleted or had their visibility changes).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        During a visibility timeout, subsequent calls with the same <code>ReceiveRequestAttemptId</code> return
     *        the same messages and receipt handles. If a retry occurs within the deduplication interval, it resets the
     *        visibility timeout. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *        >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <important>
     *        <p>
     *        If a caller of the <code>ReceiveMessage</code> action still processes messages when the visibility timeout
     *        expires and messages become visible, another worker consuming from the same queue can receive the same
     *        messages and therefore process duplicates. Also, if a consumer whose message processing time is longer
     *        than the visibility timeout tries to delete the processed messages, the action fails with an error.
     *        </p>
     *        <p>
     *        To mitigate this effect, ensure that your application observes a safe threshold before the visibility
     *        timeout expires and extend the visibility timeout as necessary.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        While messages with a particular <code>MessageGroupId</code> are invisible, no more messages belonging to
     *        the same <code>MessageGroupId</code> are returned until the visibility timeout expires. You can still
     *        receive messages with another <code>MessageGroupId</code> as long as it is also visible.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a caller of <code>ReceiveMessage</code> can't track the <code>ReceiveRequestAttemptId</code>, no
     *        retries work until the original visibility timeout expires. As a result, delays might occur but the
     *        messages in the queue remain in a strict order.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length of <code>ReceiveRequestAttemptId</code> is 128 characters. <code>ReceiveRequestAttemptId</code>
     *        can contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation
     *        (<code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     *        </p>
     *        <p>
     *        For best practices of using <code>ReceiveRequestAttemptId</code>, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     *        >Using the ReceiveRequestAttemptId Request Parameter</a> in the <i>Amazon Simple Queue Service Developer
     *        Guide</i>.
     */

    public void setReceiveRequestAttemptId(String receiveRequestAttemptId) {
        this.receiveRequestAttemptId = receiveRequestAttemptId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of <code>ReceiveMessage</code> calls. If a networking issue occurs after a
     * <code>ReceiveMessage</code> action, and instead of a response you receive a generic error, you can retry the same
     * action with an identical <code>ReceiveRequestAttemptId</code> to retrieve the same set of messages, even if their
     * visibility timeout has not yet expired.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use <code>ReceiveRequestAttemptId</code> only for 5 minutes after a <code>ReceiveMessage</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>FifoQueue</code>, a caller of the <code>ReceiveMessage</code> action can provide a
     * <code>ReceiveRequestAttemptId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action doesn't provide a <code>ReceiveRequestAttemptId</code>,
     * Amazon SQS generates a <code>ReceiveRequestAttemptId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can retry the <code>ReceiveMessage</code> action with the same <code>ReceiveRequestAttemptId</code> if none
     * of the messages have been modified (deleted or had their visibility changes).
     * </p>
     * </li>
     * <li>
     * <p>
     * During a visibility timeout, subsequent calls with the same <code>ReceiveRequestAttemptId</code> return the same
     * messages and receipt handles. If a retry occurs within the deduplication interval, it resets the visibility
     * timeout. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action still processes messages when the visibility timeout
     * expires and messages become visible, another worker consuming from the same queue can receive the same messages
     * and therefore process duplicates. Also, if a consumer whose message processing time is longer than the visibility
     * timeout tries to delete the processed messages, the action fails with an error.
     * </p>
     * <p>
     * To mitigate this effect, ensure that your application observes a safe threshold before the visibility timeout
     * expires and extend the visibility timeout as necessary.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * While messages with a particular <code>MessageGroupId</code> are invisible, no more messages belonging to the
     * same <code>MessageGroupId</code> are returned until the visibility timeout expires. You can still receive
     * messages with another <code>MessageGroupId</code> as long as it is also visible.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of <code>ReceiveMessage</code> can't track the <code>ReceiveRequestAttemptId</code>, no retries work
     * until the original visibility timeout expires. As a result, delays might occur but the messages in the queue
     * remain in a strict order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length of <code>ReceiveRequestAttemptId</code> is 128 characters. <code>ReceiveRequestAttemptId</code> can
     * contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (
     * <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>ReceiveRequestAttemptId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     * >Using the ReceiveRequestAttemptId Request Parameter</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * 
     * @return This parameter applies only to FIFO (first-in-first-out) queues.</p>
     *         <p>
     *         The token used for deduplication of <code>ReceiveMessage</code> calls. If a networking issue occurs after
     *         a <code>ReceiveMessage</code> action, and instead of a response you receive a generic error, you can
     *         retry the same action with an identical <code>ReceiveRequestAttemptId</code> to retrieve the same set of
     *         messages, even if their visibility timeout has not yet expired.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can use <code>ReceiveRequestAttemptId</code> only for 5 minutes after a <code>ReceiveMessage</code>
     *         action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When you set <code>FifoQueue</code>, a caller of the <code>ReceiveMessage</code> action can provide a
     *         <code>ReceiveRequestAttemptId</code> explicitly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a caller of the <code>ReceiveMessage</code> action doesn't provide a
     *         <code>ReceiveRequestAttemptId</code>, Amazon SQS generates a <code>ReceiveRequestAttemptId</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can retry the <code>ReceiveMessage</code> action with the same <code>ReceiveRequestAttemptId</code>
     *         if none of the messages have been modified (deleted or had their visibility changes).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         During a visibility timeout, subsequent calls with the same <code>ReceiveRequestAttemptId</code> return
     *         the same messages and receipt handles. If a retry occurs within the deduplication interval, it resets the
     *         visibility timeout. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *         >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *         </p>
     *         <important>
     *         <p>
     *         If a caller of the <code>ReceiveMessage</code> action still processes messages when the visibility
     *         timeout expires and messages become visible, another worker consuming from the same queue can receive the
     *         same messages and therefore process duplicates. Also, if a consumer whose message processing time is
     *         longer than the visibility timeout tries to delete the processed messages, the action fails with an
     *         error.
     *         </p>
     *         <p>
     *         To mitigate this effect, ensure that your application observes a safe threshold before the visibility
     *         timeout expires and extend the visibility timeout as necessary.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         While messages with a particular <code>MessageGroupId</code> are invisible, no more messages belonging to
     *         the same <code>MessageGroupId</code> are returned until the visibility timeout expires. You can still
     *         receive messages with another <code>MessageGroupId</code> as long as it is also visible.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a caller of <code>ReceiveMessage</code> can't track the <code>ReceiveRequestAttemptId</code>, no
     *         retries work until the original visibility timeout expires. As a result, delays might occur but the
     *         messages in the queue remain in a strict order.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The length of <code>ReceiveRequestAttemptId</code> is 128 characters.
     *         <code>ReceiveRequestAttemptId</code> can contain alphanumeric characters (<code>a-z</code>,
     *         <code>A-Z</code>, <code>0-9</code>) and punctuation (
     *         <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     *         </p>
     *         <p>
     *         For best practices of using <code>ReceiveRequestAttemptId</code>, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     *         >Using the ReceiveRequestAttemptId Request Parameter</a> in the <i>Amazon Simple Queue Service Developer
     *         Guide</i>.
     */

    public String getReceiveRequestAttemptId() {
        return this.receiveRequestAttemptId;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The token used for deduplication of <code>ReceiveMessage</code> calls. If a networking issue occurs after a
     * <code>ReceiveMessage</code> action, and instead of a response you receive a generic error, you can retry the same
     * action with an identical <code>ReceiveRequestAttemptId</code> to retrieve the same set of messages, even if their
     * visibility timeout has not yet expired.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use <code>ReceiveRequestAttemptId</code> only for 5 minutes after a <code>ReceiveMessage</code> action.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you set <code>FifoQueue</code>, a caller of the <code>ReceiveMessage</code> action can provide a
     * <code>ReceiveRequestAttemptId</code> explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action doesn't provide a <code>ReceiveRequestAttemptId</code>,
     * Amazon SQS generates a <code>ReceiveRequestAttemptId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can retry the <code>ReceiveMessage</code> action with the same <code>ReceiveRequestAttemptId</code> if none
     * of the messages have been modified (deleted or had their visibility changes).
     * </p>
     * </li>
     * <li>
     * <p>
     * During a visibility timeout, subsequent calls with the same <code>ReceiveRequestAttemptId</code> return the same
     * messages and receipt handles. If a retry occurs within the deduplication interval, it resets the visibility
     * timeout. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * If a caller of the <code>ReceiveMessage</code> action still processes messages when the visibility timeout
     * expires and messages become visible, another worker consuming from the same queue can receive the same messages
     * and therefore process duplicates. Also, if a consumer whose message processing time is longer than the visibility
     * timeout tries to delete the processed messages, the action fails with an error.
     * </p>
     * <p>
     * To mitigate this effect, ensure that your application observes a safe threshold before the visibility timeout
     * expires and extend the visibility timeout as necessary.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * While messages with a particular <code>MessageGroupId</code> are invisible, no more messages belonging to the
     * same <code>MessageGroupId</code> are returned until the visibility timeout expires. You can still receive
     * messages with another <code>MessageGroupId</code> as long as it is also visible.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a caller of <code>ReceiveMessage</code> can't track the <code>ReceiveRequestAttemptId</code>, no retries work
     * until the original visibility timeout expires. As a result, delays might occur but the messages in the queue
     * remain in a strict order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length of <code>ReceiveRequestAttemptId</code> is 128 characters. <code>ReceiveRequestAttemptId</code> can
     * contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation (
     * <code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     * </p>
     * <p>
     * For best practices of using <code>ReceiveRequestAttemptId</code>, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     * >Using the ReceiveRequestAttemptId Request Parameter</a> in the <i>Amazon Simple Queue Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param receiveRequestAttemptId
     *        This parameter applies only to FIFO (first-in-first-out) queues.</p>
     *        <p>
     *        The token used for deduplication of <code>ReceiveMessage</code> calls. If a networking issue occurs after
     *        a <code>ReceiveMessage</code> action, and instead of a response you receive a generic error, you can retry
     *        the same action with an identical <code>ReceiveRequestAttemptId</code> to retrieve the same set of
     *        messages, even if their visibility timeout has not yet expired.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can use <code>ReceiveRequestAttemptId</code> only for 5 minutes after a <code>ReceiveMessage</code>
     *        action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you set <code>FifoQueue</code>, a caller of the <code>ReceiveMessage</code> action can provide a
     *        <code>ReceiveRequestAttemptId</code> explicitly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a caller of the <code>ReceiveMessage</code> action doesn't provide a
     *        <code>ReceiveRequestAttemptId</code>, Amazon SQS generates a <code>ReceiveRequestAttemptId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can retry the <code>ReceiveMessage</code> action with the same <code>ReceiveRequestAttemptId</code> if
     *        none of the messages have been modified (deleted or had their visibility changes).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        During a visibility timeout, subsequent calls with the same <code>ReceiveRequestAttemptId</code> return
     *        the same messages and receipt handles. If a retry occurs within the deduplication interval, it resets the
     *        visibility timeout. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     *        >Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     *        </p>
     *        <important>
     *        <p>
     *        If a caller of the <code>ReceiveMessage</code> action still processes messages when the visibility timeout
     *        expires and messages become visible, another worker consuming from the same queue can receive the same
     *        messages and therefore process duplicates. Also, if a consumer whose message processing time is longer
     *        than the visibility timeout tries to delete the processed messages, the action fails with an error.
     *        </p>
     *        <p>
     *        To mitigate this effect, ensure that your application observes a safe threshold before the visibility
     *        timeout expires and extend the visibility timeout as necessary.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        While messages with a particular <code>MessageGroupId</code> are invisible, no more messages belonging to
     *        the same <code>MessageGroupId</code> are returned until the visibility timeout expires. You can still
     *        receive messages with another <code>MessageGroupId</code> as long as it is also visible.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a caller of <code>ReceiveMessage</code> can't track the <code>ReceiveRequestAttemptId</code>, no
     *        retries work until the original visibility timeout expires. As a result, delays might occur but the
     *        messages in the queue remain in a strict order.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length of <code>ReceiveRequestAttemptId</code> is 128 characters. <code>ReceiveRequestAttemptId</code>
     *        can contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and punctuation
     *        (<code>!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~</code>).
     *        </p>
     *        <p>
     *        For best practices of using <code>ReceiveRequestAttemptId</code>, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-receiverequestattemptid-request-parameter.html"
     *        >Using the ReceiveRequestAttemptId Request Parameter</a> in the <i>Amazon Simple Queue Service Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiveMessageRequest withReceiveRequestAttemptId(String receiveRequestAttemptId) {
        setReceiveRequestAttemptId(receiveRequestAttemptId);
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
        if (getQueueUrl() != null)
            sb.append("QueueUrl: ").append(getQueueUrl()).append(",");
        if (getAttributeNames() != null)
            sb.append("AttributeNames: ").append(getAttributeNames()).append(",");
        if (getMessageAttributeNames() != null)
            sb.append("MessageAttributeNames: ").append(getMessageAttributeNames()).append(",");
        if (getMaxNumberOfMessages() != null)
            sb.append("MaxNumberOfMessages: ").append(getMaxNumberOfMessages()).append(",");
        if (getVisibilityTimeout() != null)
            sb.append("VisibilityTimeout: ").append(getVisibilityTimeout()).append(",");
        if (getWaitTimeSeconds() != null)
            sb.append("WaitTimeSeconds: ").append(getWaitTimeSeconds()).append(",");
        if (getReceiveRequestAttemptId() != null)
            sb.append("ReceiveRequestAttemptId: ").append(getReceiveRequestAttemptId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReceiveMessageRequest == false)
            return false;
        ReceiveMessageRequest other = (ReceiveMessageRequest) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        if (other.getMessageAttributeNames() == null ^ this.getMessageAttributeNames() == null)
            return false;
        if (other.getMessageAttributeNames() != null && other.getMessageAttributeNames().equals(this.getMessageAttributeNames()) == false)
            return false;
        if (other.getMaxNumberOfMessages() == null ^ this.getMaxNumberOfMessages() == null)
            return false;
        if (other.getMaxNumberOfMessages() != null && other.getMaxNumberOfMessages().equals(this.getMaxNumberOfMessages()) == false)
            return false;
        if (other.getVisibilityTimeout() == null ^ this.getVisibilityTimeout() == null)
            return false;
        if (other.getVisibilityTimeout() != null && other.getVisibilityTimeout().equals(this.getVisibilityTimeout()) == false)
            return false;
        if (other.getWaitTimeSeconds() == null ^ this.getWaitTimeSeconds() == null)
            return false;
        if (other.getWaitTimeSeconds() != null && other.getWaitTimeSeconds().equals(this.getWaitTimeSeconds()) == false)
            return false;
        if (other.getReceiveRequestAttemptId() == null ^ this.getReceiveRequestAttemptId() == null)
            return false;
        if (other.getReceiveRequestAttemptId() != null && other.getReceiveRequestAttemptId().equals(this.getReceiveRequestAttemptId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getMessageAttributeNames() == null) ? 0 : getMessageAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getMaxNumberOfMessages() == null) ? 0 : getMaxNumberOfMessages().hashCode());
        hashCode = prime * hashCode + ((getVisibilityTimeout() == null) ? 0 : getVisibilityTimeout().hashCode());
        hashCode = prime * hashCode + ((getWaitTimeSeconds() == null) ? 0 : getWaitTimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getReceiveRequestAttemptId() == null) ? 0 : getReceiveRequestAttemptId().hashCode());
        return hashCode;
    }

    @Override
    public ReceiveMessageRequest clone() {
        return (ReceiveMessageRequest) super.clone();
    }

}
