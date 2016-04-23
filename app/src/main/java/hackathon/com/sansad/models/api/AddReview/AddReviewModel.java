package hackathon.com.sansad.models.api.AddReview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by saketh on 9/12/15.
 */
public class AddReviewModel {@SerializedName("code")
@Expose
private int code;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("response")
    @Expose
    private AddReviewResponse response;

    /**
     *
     * @return
     * The code
     */
    public int getCode() {
        return code;
    }

    /**
     *
     * @param code
     * The code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The response
     */
    public AddReviewResponse getResponse() {
        return response;
    }

    /**
     *
     * @param response
     * The response
     */
    public void setResponse(AddReviewResponse response) {
        this.response = response;
    }

}