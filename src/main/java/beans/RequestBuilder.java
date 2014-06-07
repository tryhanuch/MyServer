package beans;

/**
 * Created by tish on 07.06.2014.
 */
public class RequestBuilder implements MessageBuilder {
    private DataMapper dataMapper;

    public DataMapper getDataMapper() {
        return dataMapper;
    }

    public void setDataMapper(DataMapper dataMapper) {
        this.dataMapper = dataMapper;
    }

    public void process(byte[] msg) {

    }
}
