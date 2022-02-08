package ai.james.dao.mapper;

import ai.james.model.entity.CorrectionModule;
import ai.james.model.entity.PubWorlds;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author James Zow
 * @since 2022-01-06
 */
public interface CorrectionModuleMapper extends BaseMapper<CorrectionModule> {

    List<PubWorlds> matchVocabularyData(Map<String, Object> wordsBoMap);

}