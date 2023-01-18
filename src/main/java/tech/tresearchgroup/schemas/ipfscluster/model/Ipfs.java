package tech.tresearchgroup.schemas.ipfscluster.model;

import java.util.List;
import com.jsoniter.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ipfs{

	@JsonProperty("addresses")
	private List<String> addresses;

	@JsonProperty("id")
	private String id;

	@JsonProperty("error")
	private String error;
}